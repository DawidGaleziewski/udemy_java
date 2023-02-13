public class MethodOverloading {
    public static void main(String[] args) {
        // Method overloading occurs when class has multiple methods with same name but different parameters
        // java will resolve which method it needs to execute based on the arguments being passed, when the method is invoked
        // this is due to method signature in java including name and parameters
        // ! return type and parameter name are not parts of the signature
        kick();
        kick("bin");
        kick(23);
        kick("lamp", 180);
    }


    public static void kick(){
        System.out.println("pfff, kicking air");
    }

    public static void kick(String target){
        System.out.println("kicking target " + target);
    }

    public  static  void  kick(int force){
        System.out.println("kicking with a force of " + force);
    }

    // number of parameters matter as well
    public static void kick(String target, float degree){
        System.out.printf("kicking target %s, in a degree %s", target, degree);
    }
}
