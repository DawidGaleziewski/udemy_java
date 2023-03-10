public class Composition {
    // inheritance defines an "IS A" relationship. I.E. monitor is a product, cat is a animal
    // Composition defines a HAS A relationship

    // When using composition we create a object out of different parts that make a whole

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

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

class Product {
    private String manufacturer;
    private String model;
    private int width;
    private int height;
    private int depth;
    public Product(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
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