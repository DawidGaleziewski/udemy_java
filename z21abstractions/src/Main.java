import java.util.List;

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

        Dog dog = new Dog("dog", "big", 30);
        Cat cat = new Cat("cat", "big", 30);

        dog.makeNoise();
        cat.makeNoise();

        //as with normal inheritance we can use child classes where parent class was used
        doAnimalStuff(dog);
        doAnimalStuff(cat);
        List<Animal> zoo = List.of(new Dog("dog", "big", 30), new Cat("cat", "big", 30)); // same goes for collections. We can use a child class and use methods that it has in common with the parent
    }

    public static void doAnimalStuff(Animal animal){
        animal.move(300);
    }
}



abstract class Animal { // abstract class modifier
    // abstract class is incomplete, therefore we cannot create a instance of abstract class using the "new" keyword

    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    protected String type;
    private String size;
    private double weight;
    // when using abstrac class with abstract methods a subclass HAS to implement those methods
    // also subclass won't be able to inherit a abstract methods
    public abstract void move(int speed); // abstract method has no body, just the class signature. This will force implementation of this method on each concrete class extending this one

    protected void makeNoise(){
        System.out.printf("% is making a noise %s%n", this.type); //this however will work just like normal method when inheriting
    }
}

abstract class Mammal extends Animal { // one abstract class can extend another
    public Mammal(String type, String size, double weight){
        super(type, size, weight); // abstract class will force our subclasses to call a super constructor, despite the fact the abstract class cannot be initialized on its own
    }
}

class Dog extends Animal { // Mammal is abstract class but dog is concrete
    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void move(int speed){
        System.out.printf("Dog running with speed %s%n", speed);
    }
}

class Cat extends Animal { // Mammal is abstract class but dog is concrete
    public Cat(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void move(int speed){
        System.out.printf("Cat running with speed %s%n", speed);
    }
}