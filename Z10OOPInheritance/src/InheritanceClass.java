public class InheritanceClass {
    public static void main(String[] args) {

    }
}

class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(){}; // if we inherit we need to declare default noargs constructor
    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println("Rrrrrr!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Cat extends Animal {
    public Cat(){
        super(); // super calls parents constructor. Similar to this()
        // if we do not call super() java will call it for us using super's default constructor
    }
}
