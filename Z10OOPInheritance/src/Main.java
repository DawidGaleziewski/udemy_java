public class Main {
    public static void main(String[] args) {
        // # Class setters and getters
        // we can think about class as a more powerful user defined data type
        System.out.println("Hello world!");
//        DogClass dog = new DogClass();
        DogClass dog = null; // worth noting is that we can assign null to a variable that is og type of a Class object. This can cause errors if we want to access its methods
        dog = new DogClass();
        dog.setRace("Beagle");
        dog.getRace();
        dog.describeDog();
        dog.setAge(20);
        System.out.println("dogs age is " + dog.getAge());

        // # class constructors
        // thanks to constructor we can pass the fields values when we initialise the object
        CartConstructorClass cart = new CartConstructorClass("cloths", 1000, 15, "Mark");

        // # static variables
        StaticAndInstanceVariablesClass example = new StaticAndInstanceVariablesClass();
        System.out.println("number of static variable instances: " +  StaticAndInstanceVariablesClass.numberOfInstances);
        StaticAndInstanceVariablesClass example2 = new StaticAndInstanceVariablesClass();
        System.out.println("number of static variable instances: " +  StaticAndInstanceVariablesClass.numberOfInstances); // best practise is to access the static member variables from class, despite the fact we could use the instance

        // static variables require us to be extra careful. This is how things can go wrong
        StaticAndInstanceVariablesClass jake = new StaticAndInstanceVariablesClass("Jake");
        StaticAndInstanceVariablesClass mike = new StaticAndInstanceVariablesClass("Mike"); // as those variables share same static variable, this will override mike as well

        System.out.println("name of jake variable " + jake.name);
        System.out.println("name of mike variable " + mike.name);

        // # static methods
        StaticAndInstanceMethodsClass.getMyNumber(5412); // way to use static method

        // # POJOS
        for (int i = 1; i <= 5; i++){
            POJOClass student = new POJOClass("S921301" + i, "Mark", "27/20/2000", "class");
            System.out.println(student); // notice we do not have to use toString method. This is due to our overridden toString method with its specific signature, some java methods will know to use it under the hood.
        }

        // # Records
        RecordExample re = new RecordExample("Mike", 21);
        re.age(); // we can access the properties via accessor method
        re.toString(); // it has also build in to string method
        // # inheritance
        Animal blob = new Animal("Generic", "small", 40);
        doAnimalStuff(blob, "1km/h");

        Cat mittens = new Cat();
        doAnimalStuff(mittens, "20km/h"); // we can pass cat type to a interface accepting animal as it inherits from it

        Fish goldie = new Fish("ioa", "small", 4, 4, 2);
        doAnimalStuff(goldie, "5km/h");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        animal.toString();
    }
}