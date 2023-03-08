public class StringBuilderClass {
    public static void main(String[] args) {
        // String is unmutable, each change returns a new instance.
        // StringBuilder is mutable class, allowing us to change the characters

        // we can create a new String builder instance by using 4 overloader constructors
        StringBuilder helloBuilder = new StringBuilder("hello");
        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder empty5Builder = new StringBuilder(5);
        StringBuilder builderBuilder = new StringBuilder(helloBuilder);


        // Difference between string and string builder operation
        String helloWorld = "Hello" + " World";
        // when we use string, we first put "hello world" string literal into heap memory. After that we put "and goodbye". Concat will return new 3rd string literal into heap memory with whole sentence
        helloWorld = helloWorld.concat(" and goodbye!"); // we HAVE to re asign the result of concat. Concat does not mutate the data it just returns a new string

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World"); // string builder will referance same object in memory and that value can change
        helloWorldBuilder.append(" and goodbye!");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        // capacity
        StringBuilder emptyBuilder0 = new StringBuilder(); // by default string build will take 16 capacity (16 characters) before it requests more memory
        StringBuilder emptyBuilder20 = new StringBuilder(20); // we can also define a capacity for string builder

        printInformation(emptyBuilder0);
        printInformation(emptyBuilder20);

        emptyBuilder20.append("a".repeat(30) + "howdy there"); // capacity will dynamically when needed. Worth mentioned that the whole string will need to be copied in case of this operation
        printInformation(emptyBuilder20);

        // some useful string manipulation methods (those can be chained if needed)
        emptyBuilder20.reverse();
        emptyBuilder20.delete(0, 15);
        emptyBuilder20.insert(5, "bbb");
        emptyBuilder20.replace(1,3, "gggg");
    }

    public static void printInformation(String string){
        System.out.printf("String  length: %d | content \"%s\" %n", string.length(), string);

    }

    public static void printInformation(StringBuilder string){
        System.out.printf("StringBuilder length: %d | content \"%s\" %n", string.length(), string);
        System.out.printf("Capacity (only for string builder): %d %n", string.capacity());
    }
}
