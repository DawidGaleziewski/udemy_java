public class TextBlock {
    public static void main(String[] args) {
        // Text block is a special multi-line String literal format
        // like a String with a new representation in the source code
        // implemented since jdk 15
        String textBlock = """
            Howdy there
            easy formating
                event tabs are here
            """;
        System.out.println(textBlock);
    }
}
