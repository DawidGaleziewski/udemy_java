// some good usages of static variables:
// - storing counters
// - generating unique ids
// - storing const values that wont change like PI
// - creating and controlling access to shared resource like database
public class StaticAndInstanceVariablesClass {
    // static variables, or static member variables are created by adding static keyword. Those variables are aveialble on EVERY instance of the object. When we mutate the state of that variable in one place, we mutate in on every instance
    // it is considered best practice to use class name and not a referance variable to access a static variable.
    static int numberOfInstances = 0;
    public static String name;

    public StaticAndInstanceVariablesClass(){
        numberOfInstances += 1;
    }
    public StaticAndInstanceVariablesClass(String name){
        numberOfInstances += 1;
        this.name= name;
    }
}
