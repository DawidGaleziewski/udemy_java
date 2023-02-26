public class Main {
    public static void main(String[] args) {
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

        // thanks to constructor we can pass the fields values when we initialise the object
        CartConstructorClass cart = new CartConstructorClass("cloths", 1000, 15, "Mark");
    }
}