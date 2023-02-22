public class ObjectAndClasses {
    // static fields are stored in special memory location and only in one place. We can access it on class ObjectAndClasses.numberOfTickets
    public static int numberOfTickets = 15;

    // value of the field is not allocated any memory and has no value until the object is created ie Object.copyID
    public int copyID = 15;

    // same with methods. We have static methods and instance methods
    static void youCanUseMeOnlyFromClass(){};
    void youCanOnlyUseMeOnObject(){};
};