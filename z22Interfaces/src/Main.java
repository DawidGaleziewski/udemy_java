public class Main {
    // interface is similar to class.
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
    }

}

interface Flight {
    // any method declared in interface by default is abstract
    void liftOff();
    abstract void land(String place);
}

interface Trackable {
    abstract void showPosition();
}

abstract class Animal {}

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