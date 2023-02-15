public class SwitchClass {
    public static void main(String[] args) {
        System.out.println(traditionalSwitch(1));
        System.out.println(traditionalSwitch(4));
        System.out.println(traditionalSwitch(7));

        System.out.println(newSwitch(1));
        System.out.println(newSwitch(4));
        System.out.println(newSwitch(7));
    }

    public static String traditionalSwitch(int month){
        switch (month){
            case 1:
            case 2:
            case 3:
                return "1st quoter";
            case 4:
            case 5:
            case 6:
                return "2nd quoter";
            default:
                return "3rd quoter";
        }
    }

    // probably not a concern for next 50 years in javaland :)
    public static String newSwitch(int month){ // this is only viable from jdk 14
        return switch (month){
            case 1, 2, 3 ->  "1st quoter";
            case 4, 5, 6 -> "2st quoter";
            case 7, 8, 9 -> "3rd quoter";
            case 10, 11, 12 -> "4th quoter"; // -> "string" is transleted to yield "string"
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; // if we used return this would throw an error. We need to use yield
            }
        };
    }
}
