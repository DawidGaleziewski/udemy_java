public class StringOftenUsed {


    public static void main(String[] args) {
        // strings are indexed just like in js
        String text = "The time I decided our stories are gonna be told\n" +
                "This is when legends are born, we pavin' the road\n" +
                "The future that favors the bold";

        System.out.printf("Length of the string is %d%n", text.length());
        int index = 6;
        System.out.printf("Char at index %d is %c%n",index, text.charAt(index)); // we cannot just access index like in js with text[6]. We have to use build in method chatAr
        System.out.printf("Index of future is %s%n", text.indexOf("future")); // works same as js version
        System.out.printf("# to lower:%n %s", text.toLowerCase());

        // startsWith, endsWith and contains working same as in js
        System.out.printf("text contains string (%s)%n", text.contains("time"));
        System.out.printf("text starts with string (%s)%n", text.startsWith("time"));
        System.out.printf("text ends with string (%s)%n", text.endsWith("time"));

        // replace
        System.out.printf("Replace spaces %s%n", text.replace(" ", "#"));
    }
}
