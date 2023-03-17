import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        binarySearch();
        checkingEqualityOfArrays();
    }

    public static void binarySearch(){
        // linear search - goes from beggining to the end of the array
        // interval search - splits the array into two parts determining which one can have the searched object

        // Java provides binary search, which is a interval search, on many collection classes

        // for binary search to work, the array HAS to be sorted and if there are duplicate values there is no guarant on finsing the value
        String[] names = {"Jake", "Mark", "John", "Steve"};
        Arrays.sort(names); // array needs to be sorted first for this to work
        int candidateIndex = Arrays.binarySearch(names, "John"); // binary serach will return the index of the element, if nothing is found it will return -1

        if(candidateIndex != -1){
            System.out.printf("# candidate found at index %d, his name is %s%n", candidateIndex, names[candidateIndex]);
        }
    };

    public static void checkingEqualityOfArrays(){
        int[] s1 = {1,3,2,7,5};
        int[] s2 = {1,3,2,7,5};
        boolean areEqualArrays1 = Arrays.equals(s1, s2);
        System.out.printf("# arrays are equal 1 %s%n", areEqualArrays1);

        Arrays.sort(s1);
        boolean areEqualArrays2 = Arrays.equals(s1, s2); // arrays will not be equal if their order differs
        System.out.printf("# arrays are equal 2 %s%n", areEqualArrays2);
    }

}
