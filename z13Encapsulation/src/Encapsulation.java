public class Encapsulation {
    // we use encapsulation in order to:
    // Make interfaces simpler, hide unnecessary details
    // Protect the integrity of data on a object
    // Decuoupe the published interface (class members that are exposed to the calling code) from the internal details of the class

    public static void main(String[] args) {
        // example of  ot encapsulated class
        Player john = new Player();
        john.name = "John";
        john.health = 100;
        john.loseHealth(50);
        john.health = 2000; // this will get around our setters and getters where we control i.e max health player can have
        john.loseHealth(60);
    }
}

class Player {
    public String name;
    public int health;
    public String weapon;
    public int maxHealth = 100;

    void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("You died.");
        }
    }

    void restoreHealth(int extraHealth){
        int newHealthValue =  this.health + extraHealth;
        if(newHealthValue >= this.maxHealth){
            this.health = this.maxHealth;
            return;
        }
        this.health = newHealthValue;
    }

    int healthRemaining(){
        return this.health;
    }
}
