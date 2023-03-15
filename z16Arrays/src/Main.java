
public class Main {
    // java provides multiple types of containers to store multiple values, array is one of the more basic ones.
    // java allows us to store values of same type
    public static void main(String[] args) {

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
}