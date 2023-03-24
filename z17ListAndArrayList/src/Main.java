import java.util.ArrayList;
import java.util.List;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Unknown",  1);
    }
};
public class Main {
    public static void main(String[] args) {
        // lists are java containers that are more advanced than arrays as they allow us to change the length of our collection (resize it).
        // there are two classes for lists: ArrayLists and LinkedLists
        // List is a special type in java called interface
        // List interface describes a set of method signatures that all List classes are expected to have.
        // arrays can be conrted to Lists using factory method on the class
        String[] names = {"MIke", "Dave"};
        List<String> nameList = List.of(names);// factory .of converts array to list. This list is however a IMMUTABLE collection
//        nameList.add("Jerry"); // throws a error
        System.out.printf("#List: %s%n", nameList);

        arrayLists();
    }

    public static void arrayLists(){
        // ArrayList is a resizable array that implements the List<E> interface
        // ArrayList is a class that maintains an array in memory, that's bigger than what we need in most cases (array capacity).
        // Array list will keep track of arrays size and its capacity
        ArrayList objectList = new ArrayList(); // this will create a array list that will be a array of object (unsafe to use

        // most of the times we want to specify the types stored in the ArrayList
        // we still need <> domain operator to be used, so that java can infer the type in compiletime
        // array without any type is called a raw arraylist and intellij will throw a warning to inform us on it.
        ArrayList<GroceryItem> groceryList = new ArrayList(); // type arguments do not have to be provided to a generic if it was specified in variable declaration
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Carrot"));
        groceryList.add(2, new GroceryItem("Carrot")); // we can specify the index of item added to a linked list
        System.out.println(groceryList);

        // creating and populating arrayList on declaration
        // In this example we use factory for creating a list of strings and return it to newly initialised ArrayList
        ArrayList shopList = new ArrayList<>(
                List.of("Tesco", "Biedronka")
        );
    };
}