public class Composition {
    // inheritance defines an "IS A" relationship. I.E. monitor is a product, cat is a animal
    // Composition defines a HAS A relationship
    // as General rule we probably want to try use "composition before inheritance"

    // composition is better than inheritance due to fact that it is more flexible, we can add or remove parts and they will less likely have downstream effect
    // inheritacne will break encapsulation, sublclasses may need direct access to a parents state or behaviour

    public static void main(String[] args) {
        // When using composition we create a object out of different parts that make a whole
        ComputerCase exCaseTerminator = new ComputerCase("t12", "Honda");
        Motherboard motherFBoarder = new Motherboard("i12", "Dell");
        Monitor gawker = new Monitor("watcher12", "Samsung");


        PersonalComputer beastPC = new PersonalComputer("beast", "mixed", exCaseTerminator, gawker, motherFBoarder);
        // composition: creating a pc object, composed out of own custom classes
        // We do not want to allow usage of those components directly
        //  beastPC.getMotherboard().loadProgram("MS word");
        //  beastPC.getMonitor().drawPixelAt(2,2, "red");

        beastPC.powerUp(); // composition is mostly about creating objects inside the object
    }

}

// using composition for new class
class PersonalComputer extends Product { // we firstly want to extand same Product as rest of the components
    // here we see composition in action. We can use other classes we have created as our fields.
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard){
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){ // we make this private as we only want it to be run from inside our class (other methods of this class)
        this.monitor.drawPixelAt(1200,5, "yellow"); // we abstract the method away, use the components in our class methods
    };

    public  void powerUp(){
        this.computerCase.pressPowerButton();
        this.drawLogo();
    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}

class Dimensions {
    private int width;
    private int height;
    private int depth;

    Dimensions(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class Product {
    private String manufacturer;
    private String model;


    // a example of using composition over inheritance is: we may have a digital product, this wont have those properties. We can modify this class by moving those properties into new object callsed Dimensions
//    private int width;
//    private int height;
//    private int depth;

    private Dimensions dimensions; // moved properties we do not want to be inherited by every product into composition

    public Product(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Product(String model, String manufacturer, Dimensions dimensions){
        this(model, manufacturer);
        this.dimensions = dimensions;
    }
}


class Monitor extends Product {
    private int size;
    private  String resolution;
    public Monitor(String model, String manufacturer){
        super(model, manufacturer);
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("drawing pixel at: %d,%d in color %s", x,y,color));
    }
}

class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer){
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots){ // notice how we are chainging the constructors
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String loadProgram){
        System.out.println("Loading program... " +  loadProgram);
    }
}

class ComputerCase extends Product {
    private String powerSuppy;
    public ComputerCase(String model, String manufacturer){
        super(model, manufacturer);
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}