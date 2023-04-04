public class Main {
    public static void main(String[] args) {
        // we can use Array.sort on objects that implement Comperable interface
        // Strings and primitive wrapper classes like Integer are sortable due to fact they implement Comperable interface

    }
}


// Comperable interface
interface CopyOfComparable<T> {
    int compareTo(T o); // any class that implements this interface needs to implement the compareTo method
}