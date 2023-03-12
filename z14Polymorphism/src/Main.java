public class Main {
    // poly - multiple, morph - shapes.
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
}

class Car extends Vehicle {
    public Car(String name, int speed){
        super(name, speed);
    }
}

class Plane extends Vehicle {
    public Plane(String name, int speed){
        super(name, speed);
    }
}

class Submarine extends  Vehicle {
    public Submarine(String name, int speed){
        super(name, speed);
    }

    @Override
    void move(String destination) {
        super.move(destination);
        System.out.println("..bzzzz moving under water");
    }
}