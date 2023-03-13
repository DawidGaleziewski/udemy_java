public class Main {
    // poly - multiple, morph - shapes.
    // Polymophism lets us write code call a method, but at runtime this mehod behaviour can be different for different objects
    public static void main(String[] args) {

        // same method "move, has different implementations.
        Vehicle ufo = new Vehicle("unknown", 40000);
        ufo.move("X");

        Car rudy = new Car("Honda", 40);
        rudy.move("warsaw");

        Plane bezos19 = new Plane("star explorer", 140);
        bezos19.move("USA");

        // !important. Notice this will be decided on RUNTIME! This is a great example of polymophism in active
        Vehicle yellow = new Submarine("yellow", 40);// notice!, despite this beeing class Vehicle, when we initize this object it is of type SUBMARINE. This is due the fact that JAVA JIT decides what type this object is in RUNTIME!
        yellow.move("pacific");

        // we can create object using "factory method"
        // beauty of this solution is that we can awlays add new subclasses to the factory and this can be used as it would be. We can add and support new types easily.
        Vehicle wildhog = Vehicle.getVehicle("c", "hogger", 300);
        wildhog.move("forest");

        // ## var usage - runtime vs compile time types
        // Interesting thing to notice is that when using factory it will throw a error when we use a more specific type
        // Compiler will not know what type will be returned. This is a job for the runtime.
        // we can fix this using casting, telling the compiler what will be the type returned (Car);
        Car mysteryMachine = (Car) Vehicle.getVehicle("c", "mm", 10); // we should be careful with this. If we are casting just like in typescript. We are telling compiler we are smarter and we know better.
        // If we lie to comp;oer we will get a runtime exception.

        // vars i  java are special contextual keywords, that allow us to take advantage of "Local Variable Type Inference" LVTI
        // in short we are telling java to figure out the compile-time type for us
        var redOctober = Vehicle.getVehicle("S", "red october", 30); // var was introduced in java 8

        // ## testing runtime types
        Object unknownVehicle = Vehicle.getVehicle("S", "red october", 30);
        if(unknownVehicle.getClass().getSimpleName() == "Submarine"){ // we can check the type
            Submarine submarineVehicle = (Submarine) unknownVehicle; // after this we can assert it...
            submarineVehicle.fireTorpedo("base"); // ...and use its specific methods
        }
    }

}

class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move(String destination){
        String instanceType = this.getClass().getSimpleName(); // This will decide on what type it is during runtime.
        System.out.printf("Moving vehicle %s of type %s, to %s with speed %d%n",this.name, instanceType, destination, this.speed);
    }

    // a factory method. Used when we do not care what class instance is the object. We do not care in this case, we want internals of the method to decide this for us.
    public static Vehicle getVehicle(String type, String name, int speed){
        return switch (type.toUpperCase().charAt(0)){
            case 'C' -> new Car(name, speed);
            case 'S' -> new Submarine(name, speed);
            default -> new Vehicle(name, speed);
        };
    };
}

class Car extends Vehicle {
    public Car(String name, int speed){
        super(name, speed);
    }
}

class Plane extends Vehicle {
    public Plane(String name, int speed){
        super(name, speed);
        System.out.println("ffffffff.....");
    }
}

class Submarine extends  Vehicle {
    public Submarine(String name, int speed){
        super(name, speed);
    }

    public void fireTorpedo(String target){
        System.out.println("Firing torpedo at " + target);
    }

    @Override
    void move(String destination) {
        super.move(destination);
        System.out.println("..bzzzz moving under water");
    }
}