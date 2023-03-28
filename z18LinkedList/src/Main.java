import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        big0();
        LinkedLists();
        iterators();
        listIterator();
        understandingCursorPositions();
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

            // iterating on linked list
            LinkedList<String> queue = new LinkedList<>();
            queue.addAll(List.of("John", "Mike", "Marie"));
            ListIterator<String> iterator = queue.listIterator(); //we can use list iterator method for iterating over LinkedList
            while (iterator.hasNext()){
                var person = iterator.next();
                System.out.printf("# Person in a list is %s%n", person);
            }
        }

        static void iterators(){
            // we can treverse lists either by using for loops or iterators
            // iterators work in similar fashion database cursors work (fetch prat or larget set of data, iterate thru it going one row at a time)
            // instance of a iterator will have a next method
            // It is important to understand that iterator cursor positioons are BETWEEN the elements
            // [{0 cursor position} El1, {1 cursor position}EL2, {2 cursor position}EL3, {3 cursor position}EL4]

            String[] shoppingArray = {"Carrots", "Onions", "Salt", "Pepper"};
            List<String> shoppingList = List.of(shoppingArray); // iterator method is also available on List
            LinkedList<String> shoppingLinkedList = new LinkedList<>(shoppingList);

            Iterator<String> iterator = shoppingLinkedList.iterator();

            while(iterator.hasNext()){// on each iteration we check if there is  something after the cursor
                String item = iterator.next(); // we move cursor to the next item, returning that item
                // where iterator comes in handy is when we want to modify the list while we iterate over it
                if(item.equals("Salt")){
                    // !Important mutating iterator will mutate the list
                    // We should not remove the item from the list itself during the iterations, this will throw a concurrency error
                    iterator.remove(); // we remove this item from iterator. This will also remove the item from the list iterator does referance
                }
                System.out.println(item);
            }
            System.out.printf("iterator is: %s;%n list is: %s%n", iterator, shoppingLinkedList);
        }

        static void listIterator(){
            // unlike list iterator, list iterator can go both forward and backwords, it supports add and set methods as well
            LinkedList<String> buildingMaterials = new LinkedList<>(List.of("bricks", "cement", "planks", "nails"));
            ListIterator<String> iterator = buildingMaterials.listIterator(1); // by passing index we start from another position then index 0

            while(iterator.hasNext()){
                if(iterator.next().equals("cement")){
                    iterator.add("brick"); // allows us to add items as well
                }
            }

            // we can go back as well
            while(iterator.hasPrevious()){
                System.out.println(iterator.previous());
            }

            System.out.println(buildingMaterials);
        }

        static void understandingCursorPositions(){
            LinkedList<Integer> trainStations = new LinkedList<>(List.of(0,1,2,3,4));
            ListIterator<Integer> iterator = trainStations.listIterator();
            // IMPORTANT to understand is that iterator cursor is never at the point of our item in the collection. It is before it, and after it PASSES it it will return its value
            System.out.printf("Passing station: %s%n", iterator.next()); // was before index 0, now is before index 1
            System.out.printf("Passing station: %s%n", iterator.next());
            System.out.printf("Passing station: %s%n", iterator.next()); // now it is after index 2. It passed this index so it is returning its value
            System.out.printf("Passing station: %s%n", iterator.previous()); // we are going back but we are passing index 2 again so it will be returned the second time
        }
}