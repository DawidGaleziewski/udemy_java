import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        unboxingAndBoxing();
    }

    public static void unboxingAndBoxing(){
        // unlike some modern languages (i.e ruby where everything is a java) java supports primitive types.
        // primitive types hava advantage in some cases over objects
        // LinkedLists and ArrayLists do not support primitves.
        // Same goes for generics, generics do not support primitives

        // LinkedList<int> somePrimitiveList = new LinkedList<>(); // this will throw a error

        // way around this is use wrapper classes for each primitive type i.e not int but Integer
        // going from primitive to a wrapper is called boxing, and from wrapper to primitive is called unboxing

        Integer age = Integer.valueOf(18); // we can also use "new Integer(18)". valueOf is generally better as it is more performant
        LinkedList<Integer> someList = new LinkedList<>(); // this will work

        // in practice we can use autoboxing
        Integer age2 = 18; // java boxes the int into Integer wrapper. This is the best way to do it

        int unboxedAde = age2.intValue(); // now we go back to primitive

        // same as with autoboxing java supports autounboxing
        int getUnboxedAde2 = age2;

        // boxing and unboxing works also when returned from methods
        Integer age3 =  getIntPrimitive();
        int age4 = getIntObject();

        // IMPORTANT, wrapper classes are still calsess, their default values will be nulls and not default primitive values
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.printf("array wrapper %s%n", Arrays.toString(wrapperArray)); // [50, null, null, null]
    }

    static int getIntPrimitive(){
        return 10;
    };

    static Integer getIntObject(){
        return Integer.valueOf(10);
    };

}