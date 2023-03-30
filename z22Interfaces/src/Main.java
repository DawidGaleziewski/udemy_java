public class Main {
    // interface is similar to class. But it allows us to describe behaviour only
    // Both interfaces and abstract classes are called "abstracted referance types" and can be used in code as variable types, method parameters and return types
    // It is a type that serves as a ctonreact between the class and client code.
    // it is enforced by complier
    // class that uses a interface, must implement all the abstract methods on it
    // when class agrees to a interface, it will be known also by that type. This helps classes that have little in common to be recognized as a special referance type

    public static void main(String[] args) {
        // as shown bellow bird can be many types at onec: its type, its master clase, and any interface it implements
        Bird bird = new Bird();
        Animal bird1 = new Bird();
        Flight bird2 = new Bird();
        Trackable bird3 = new Bird();
        // bird3.liftOff(); worth noting this wont work. Type we declare will narrow down methods we can use

        // we can pass any object that implements expected interface
        var jet = new Jet();
        final int BIRD_SPEED = 20; // final is a constant variable that cannot be changed
        fly(bird, BIRD_SPEED);
        fly(jet, BIRD_SPEED * 2000);

        // enums can implement interfaces as well!
        FlightStages stage = FlightStages.LAUNCH;
        stage.showPosition();
    }

    // Using interfaces or abstracted referance types is preffered as it allows many various classes to be processed uniformly by the same code
    // "Coding to an interface" allows substitution of a code without forcing a mojor refactor of code
    private static void fly(Flight flier, final int speed){ // final are constants that can't be changed
        flier.liftOff();
        if(flier instanceof  Trackable trackable) { // we can test interface same as we would class types
            trackable.showPosition();
        }
        flier.land("Tree");
    }

}

interface Flight {
    // any method declared in interface by default is abstract
    double MILES_TO_KM = 1.60934; // any fields on interface are not instance fields. They are are implicitly public, static, final (constant values)
    void liftOff();
    abstract void land(String place);
}

interface Trackable {
    abstract void showPosition();
}

// interface can extend other interfaces just like class can
interface FlyingTracker extends Flight, Trackable {
    void emitDuringFlight();
}

abstract class Animal {}

class FlyingSpyCam implements  FlyingTracker {
    @Override
    public void emitDuringFlight() {

    }

    @Override
    public void liftOff() {

    }

    @Override
    public void land(String place) {

    }

    @Override
    public void showPosition() {

    }
}

// important thing is that we can inherit only from one class in java, but we can implement multiple interfaces
class Bird extends Animal implements Flight, Trackable { // implementing interface on a class
    @Override
    public void liftOff() {

    }

    @Override
    public void land(String place) {

    }

    @Override
    public void showPosition(){

    }
}


class Jet implements Flight, Trackable { // implementing interface on a class
    @Override
    public void liftOff() {

    }

    @Override
    public void land(String place) {

    }

    @Override
    public void showPosition(){

    }
}

// enum with method
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void showPosition() {
        if(this != GROUNDED){
            System.out.println("...Tracking");
        }
    }
}