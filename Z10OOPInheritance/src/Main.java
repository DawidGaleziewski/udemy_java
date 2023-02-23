public class Main {
    public static void main(String[] args) {
        // we can think about class as a more powerful user defined data type
        System.out.println("Hello world!");
        DogClass dog = new DogClass();
        dog.setRace("Beagle");
        dog.getRace();
        dog.describeDog();
        dog.setAge(20);
        System.out.println("dogs age is " + dog.getAge());
    }
}