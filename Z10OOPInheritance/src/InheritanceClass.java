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

    private String tailColor;

    public Cat(){
        super(); // super calls parents constructor. Similar to this()
        // if we do not call super() java will call it for us using super's default constructor
    }

    public Cat(String type){
        this(type, "Large", 200, "orange"); // we can chain constructors. This constructior will call 4 args constructor that will call super constructor from Animal class
    }

    public Cat(String type, String size, double weight, String tailColor){
        super(type, size, weight); // setting animal specific field
        this.tailColor = tailColor; // extra arguments can be set in a normal fashion
    }

    public static void hiss(){

    }

    @Override
    public String toString() {
        return "Cat{" +
                "tailColor='" + tailColor + '\'' +
                "} " + super.toString(); // we can call super class method to get its fields
    }
}
