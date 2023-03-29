public class Main {
    public static void main(String[] args) {
        // abstraction and generalisation are concepts that support extensible and flexible code.
        // Abastraction and generalization refer to situation when

        // Generalization
        // - when we start modeling objects for the app, we identify what features and behaviours objects have in common
        // - we create class hierarchy and by this we perform generalization
        // - i.e when we consider octopus, dog and a penguin we will say they are all animals
        // animal does not exit, except as a way to describe a set of more specific things
        // Java allows us to create abstract classes and interfaces
        // There are also abstract methods: abstract methods have a method signature, and a return type, but do not have a method body
        // Abstract methods are a type of contract, promising that all subtypes will provide promised functionality
        // anthysesis to abstract methods are concrete methods
    }

    abstract class Animal { // abstract class modifier
        // abstract class is incomplete, therefore we cannot create a instance of abstract class using the "new" keyword

    }

    abstract class Mammal extends Animal { // one abstract class can extend another

    }

    class Dog extends Animal { // Mammal is abstract class but dog is concrete

    }
}