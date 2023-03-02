public class InheritanceClass {
    public static void main(String[] args) {

    }
}

class Animal {
    protected String type; // protected is simlar to private but our subclasses will have access to it. Also classes in same package will have access to this field
    private String size; // subclasses do not have access to private fields
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
        System.out.println("sssshhh");
    }

    @Override
    public String toString() { // if we have same method (name and signature) as the one in parent class, the mor specific will override it
        return "Cat{" +
                "tailColor='" + tailColor + '\'' +
                "} " + super.toString(); // we can call super class method to get its fields
    }

    @Override
    public void makeNoise() {
        super.makeNoise(); // we can access the parents methods from super!
        System.out.println("MEOW!!");
    }
}

class Fish extends Animal {
    private int fins;
    private int gills;

    public static void moveMuscles(){
        System.out.println("Swiming forward");
    }

    public Fish(String type, String size, double weight, int fins, int gills){
        super(type,size, weight);
        this.fins = fins;
        this.gills = gills;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
