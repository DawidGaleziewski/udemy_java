import java.util.Scanner;

public class InputClass {
    public static void main(String[] args) {
        int currentYear = 2022;
        int usersDateOfBirth = 1999;


        // in java we parse between types by using class ie Integer.parseInt()
//        System.out.println("Age = " + (currentYear - usersDateOfBirth));

        // System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear){
        try {
            String name = System.console().readLine("Hi what is your name?"); // we need to run it from console as this is disabled in Intellij
            System.out.println("Howdy there " + name + " how old are you?");
            System.out.println(getInputFromScanner(currentYear));
        } catch (Exception e){
            System.out.println(getInputFromScanner(currentYear));
        }
        return "";
    }

    public static String getInputFromScanner(int currentYear){
        // we can get input by using instance of scanner class
        Scanner sc = new Scanner(System.in);// we can also pass things like files to the scanner to read the input
        System.out.println("Hi what is your name?");
        String name = sc.nextLine();

        String year;
        boolean isValidData;

        do {
            System.out.println("Which year you were born?");
            year = sc.nextLine();
            try {
                isValidData = checkValidData(currentYear, year);
            } catch (NumberFormatException badUserData){
                isValidData = false;
                System.out.println("characters not allowed");
            }
        } while(!isValidData);

        int age =  currentYear - Integer.parseInt(year);
        System.out.println(name + " so you are " + age + " years old");
        return "";
    }

    public static boolean checkValidData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if(dob < minYear){
            return false;
        }

        return true;
    }
}
