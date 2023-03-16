import java.util.Arrays;

public class Main {
    // java provides multiple types of containers to store multiple values, array is one of the more basic ones.
    // Array is a special type i nava
    // java allows us to store values of same type only in Array
    public static void main(String[] args) {
        arrayBasics();
        arrayDefaultTypes();
        javaUtilsArrays();
    }

    public static void arrayBasics(){
        System.out.println("Hello world!");
        // We declare the array by {type} name =;
        String[] nameList = new String[10]; // we can also define the [] after the name
        // we initialise the array using new {type}[size specified]
        // array size is how many slots it can take.
        // ARRAYS IN JAVA ARE NOT RESIZABLE - we cannot add elements, we can just asing elements to the index
        nameList[0] = "Dawid";
        nameList[1] = "Mark";
        nameList[2] = "Jane";

        // we can also use array  initializer just like in golang. Those can only be used when initializing array
        double[] prices = new double[]{15.00, 16.09, 1.99};

        // or even shorter
        double[] salePrices = {15.00, 16.09, 1.99};
    }

    public static void arrayDefaultTypes(){
        // just like in golang, when declaring a type that has nothing assigned to it, java will assign a default value. However java will not allow us to daclere those as individual values without initializing, but will allow us to do this with array
//        int emptyNum;
//        double emptyDouble;
//        String emptyString;
//        EmptyCustomType emptyCustomType;
//
//        System.out.printf("emptyNum: %s, emptyDouble: %s, emptyString: %s, emptyCustomType: %s", emptyNum, emptyDouble, emptyString, emptyCustomType);

        int[] numArr = new int[5];

        double[] doubleArr = new double[5];
        String[] strArr = new String[5];
        EmptyCustomType[] emptyCustomTypes = new EmptyCustomType[5];

    }

    public static void javaUtilsArrays(){
        // java.util.Arrays is a class that provides usefull function for operating on arrays
        String[] names = {"John", "Mike", "Kevin"};
        System.out.println(Arrays.toString(names)); //stringify array
        Arrays.sort(names); // this mutates the array passed
        Arrays.fill(names, "John Doe"); // fills each slot with a value

        String[] copyNames = Arrays.copyOf(names, names.length); // create the copy of array. This is when we do not want to mutate original data.
    }


}

class EmptyCustomType {
    public int test;

    public EmptyCustomType(int test) {
        this.test = test;
    }

}