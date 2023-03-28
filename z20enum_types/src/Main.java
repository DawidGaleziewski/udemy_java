public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // enum describes a collection of constants
        // enums are like array but are always known, not changable and each element can be referred to by constant name and not a index
        var day1 = Days.MONDAY;
        System.out.printf("value of enum is %s, its name is %s, its ordinal is %s %n", day1, day1.name(), day1.ordinal());

        // if we want to get a item by index
        var allDays = Days.values(); // converts into array of values
        System.out.printf("by index: %s%n", allDays[2]);

        // we can use enums in switch statment
    }



    // enam is described similary to class. Convention is to start it with uppercase letter like a class.
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY //labels
    }
}