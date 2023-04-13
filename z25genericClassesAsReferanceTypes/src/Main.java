import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class Student {
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John"};
//    public Student(){
//        int lastNameIndex = random.nextInt(65, 91);
//        name = firstNames[random.nextInt(5) + " " + (char) lastNameIndex];
//    }
}