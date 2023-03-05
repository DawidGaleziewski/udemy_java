public class FormatSpecifiers {
    public static void main(String[] args) {
        // just like golang/python java uses printf
        System.out.printf("Hey there %s you need to be %d to visit page %s", "Mike", 18, "YouHello.com");
        // syntax here is using "format specifiers" after the % symbol.
        // at most complex format specifiers can have:
        // %[argumetn_index$][flags][width][.precision]conversion
        System.out.printf("%6d"); // we specify width here telling it will take 6 spaces in width parameter

        // we can return output of formating as a string
        String formattedMsg = String.format("Your age is %d", 12);
    }
}
