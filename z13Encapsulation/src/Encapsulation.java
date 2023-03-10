public class Encapsulation {
    // we use encapsulation in order to:
    // Make interfaces simpler, hide unnecessary details
    // Protect the integrity of data on a object
    // Decuoupe the published interface (class members that are exposed to the calling code) from the internal details of the class


    // to create encapsulated class fallow those principles:
    //- create constructors for object initializaion.
    //- use private access modifer for fields
    //- do NOT overuse setters and getters
    public static void main(String[] args) {
        //# example of a class that has no encapsulation principles
        Player john = new Player();
        john.fullName = "John"; // another problem is that if we hange names of those fields we will have to go and change them everywhere in the implementation
        john.health = 100;
        john.loseHealth(50);
        john.health = 2000; // this will get around our setters and getters where we control i.e max health player can have
        john.loseHealth(60);

        // example of encapsulation
        Weapon magicAxe = new Weapon("maxic axe", 20, 20, 15); // we set fields when initializing object
        magicAxe.dullWeapon(); // we access our values/mutate them via methods. Not needed implementation details are hidden.
        magicAxe.repairWeapon();
    }
}

class Player {
    public String fullName;
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

class Weapon {
    private String name;
    private int durability;
    private int maxDurability;
    private int damage;

    public Weapon (String name, int durability, int maxDurability, int damage){
        this.name = name;

        this.maxDurability = maxDurability;

        // We can add some data validation
        this.durability = validateDurability(durability, maxDurability);
        this.damage = damage;
    }

    private int validateDurability(int durability, int maxDurability){
        if(durability < 0){
            return 0;
        } else if (durability > maxDurability) {
            return maxDurability;
        } else {
            return durability;
        }
    }

    public void dullWeapon(){
        this.durability = 0;
    }

    public void repairWeapon(){
        this.durability = maxDurability;
    }
}
