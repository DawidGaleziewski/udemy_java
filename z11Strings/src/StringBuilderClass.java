public class StringBuilderClass {
    public static void main(String[] args) {
        // String is unmutable, each change returns a new instance.
        // StringBuilder is mutable class, allowing us to change the characters

        // we can create a new String builder instance by using 4 overloader constructors
        StringBuilder helloBuilder = new StringBuilder("hello");
        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder empty5Builder = new StringBuilder(5);
        StringBuilder builderBuilder = new StringBuilder(helloBuilder);


    }
}
