import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        big0();
        LinkedLists();
    };

        static void big0(){
            // way java stores array in memory for primitives
            int[] intArr = {
                    // Each integer is 4 bytes so java will do simple math to establish that index 2 is 100 place in memory + 2x4 = 108
                    100, // stored at address 100 in memory
                    102,// stored at address 104 in memory
                    32, // stored at address 108 in memory
                    4, // stored at address 112 in memory
                    70}; // stored at address 116 in memory
            // way java stores objects in memory
            String[] strArr = {
                    // objects will be created and each array index will referance place in the memory for that object
                    // if this is a array list, addresses will still be stored in array under the hood, as arrayList is simiply a wrapper on top of a array
                    "Mike", // stored at 100000
                    "John", // stored at 789
                    "Julia", // stored 200
            };

            // its important to keep in mind that looking up is instant, while removing elements may cause a hige shift due to re-indexing of all elements
            // if we exceed the number of fields that were alocated to a arrayList, it will need to re-allocate space and create a new array, this can be a costly operation depending on the size of the array
            // way the java will add capactity to the arrayList, when we exceed the previous size of a arrayList, is dependant on the java version and we cannot really get it from the array list


            // Linked List will store value and pointer to next/previous values. Treversing (finding a element) is much costly as we need to go by each element even if we know its the 5th element. But adding and removing elements is a lot cheaper

            // LinkedList is a better choice if we will remove and add data and do not know the maximum capacity of array. Also if we know the capacity but it exceeds Integer.MAX_VALUE
            // ArrayList is better if we eaithcer read more from it, or we know the maximum capacity
            int capacity = 500_000;
            ArrayList<String> stringArrList = new ArrayList<>(capacity);
        }
        static void LinkedLists(){
            // linkedLists implement Lists, Queue and Stack methods. Therefore linkedList can be used as FIFO or LIFO data collection
            LinkedList<String> shopQueue = new LinkedList<>();

            // double linked queue methods
            shopQueue.add("Mark");
            shopQueue.add("John");
            shopQueue.add("Maria");
            System.out.println(shopQueue);
            shopQueue.addFirst("Old nasty lady"); // link lists allow us to add eaither to front or and of the list and the cost will always be O(1)
            shopQueue.addLast("Calm man");
            System.out.println(shopQueue);

            // queue methods
            shopQueue.offer("Capri");
            System.out.println(shopQueue);
            shopQueue.poll();

            // Stack methods
            shopQueue.push("Alice"); // will add to the front
            shopQueue.push("Natalie");
            System.out.println(shopQueue);
            shopQueue.pop(); // remove from front
            System.out.println(shopQueue);

            shopQueue.remove(2); // we can remove either by index or value
            shopQueue.remove("Natalie");
        }
}