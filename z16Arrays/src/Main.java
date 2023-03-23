import java.util.Arrays;

public class Main {
    // java provides multiple types of containers to store multiple values, array is one of the more basic ones.
    // Array is a special type
    // java allows us to store values of same type only in Array
    // In essence arrays are very simple objects that inherit only from java.uti.Object's functionality + it has a length property
    public static void main(String[] args) {
        arrayBasics();
        arrayDefaultTypes();
        enhancedForStatement();
        javaUtilsArrays();
        referenceTypes();
        variableArguments("Mike", "John", "Greg");
        // multi demensional arrays
        int [][] twoDimensionArray = {
                {1,2},
                {3,4,5},
                {10}
        };

        for (var outer:  twoDimensionArray){
            System.out.printf("outer: %s%n", outer);
            for(var inner: outer){
                System.out.printf("inner: %s%n", inner);
            }
        }

        // we can also define a matrix
        int[][] matrix = new int[50][2];
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

    public static void enhancedForStatement(){
        // we can use a enhanced for statment in order to print elements of array
        String[] names = {"Mark", "John", "Peter"};
        for (String element : names){
            System.out.println("#single element " + element);
        };
    }

    public static void javaUtilsArrays(){
        // java.util.Arrays is a class that provides usefull function for operating on arrays
        String[] names = {"John", "Mike", "Kevin"};
        System.out.println(Arrays.toString(names)); //stringify array
        Arrays.sort(names); // this mutates the array passed
        Arrays.fill(names, "John Doe"); // fills each slot with a value

        String[] copyNames = Arrays.copyOf(names, names.length); // create the copy of array. This is when we do not want to mutate original data.
    }

    public static void referenceTypes(){
        // each array we create and store to a variable is a referance to this array
        int[] myIntArr = new int[5]; // my int will referance in memory to this array. We know something will be a reference whenever we see "new" keyword used
        int[] anotherArr = myIntArr; // this will also referance the same array we created. We have two referances now pointing to the same place in the memory
        anotherArr[0] = 9999; // this will modify same object in memory
        System.out.printf("after we modify anotherArr[0] myIntArr changed to %s%n", myIntArr[0]);

        // when we create array of objects, each index will be a referance to that object in memory
        EmptyCustomType empty = new EmptyCustomType(0); // we create a empty type
        EmptyCustomType[] arr1 = new EmptyCustomType[5];
        EmptyCustomType[] arr2 = new EmptyCustomType[5];
        // pointing all indexes from two arrays to same referance type
        arr1[0] = empty;
        arr1[1] = empty;

        arr2[0] = empty;
        arr2[1] = empty;

        arr1[0].setTestInt(9999); // all referances will change

        System.out.printf("arr1[0]: %s, arr1[1]: %s, arr2[0]: %s, arr2[1]: %s%n", arr1[0].getTestInt(), arr1[1].getTestInt(), arr2[0].getTestInt(), arr2[1].getTestInt());

        // passing arrays to methods
        int[] newArr = new int[5];
        mutateArray(newArr); // this will be mutated
        System.out.printf("mutated arrays index 1 is: %s%n", newArr[1]);
    }

    public static void mutateArray(int[] array){ // in java we pass object by referance, therefore any mutations will carry out of the method scope
        array[1] = 66666;
    }


    public static void variableArguments(String... args){ // just like in js java can accept 0 or more arguments
        for (int i = 0; i < args.length; i++){
            System.out.printf("#args index %s, is %s %n", i, args[i]);
        }
    }
}


class EmptyCustomType {
    public int test;

    public EmptyCustomType(int test) {
        this.test = test;
    }

    public void setTestInt(int test){
        this.test = test;
    }

    public int getTestInt(){
        return this.test;
    }
}