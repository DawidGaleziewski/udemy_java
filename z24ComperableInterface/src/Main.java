import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // we can use Array.sort on objects that implement Comperable interface
        // Strings and primitive wrapper classes like Integer are sortable due to fact they implement Comperable interface
        Integer five = 5;
        Integer[] others = {0,5,10,50};

        for (Integer i : others){
            int val = five.compareTo(i); // Integers have compareTo implemented. Compare to will return -1,0, 1 values
            System.out.printf("Compare %d to %d: %d%n", i, five, val);
        }

        // implementing own compareTo
        Student[] stds = {new Student(4), new Student(10), new Student(0)};
        Arrays.sort(stds);
        System.out.printf("first student %s%n", stds[0].gradeAvg);


        // Using comparators. We can also compare passing comperator as a second argument
        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(stds, gpaSorter); // this will sort now using second argument compare method and not the array method
    }
}


// Comparable interface
interface CopyOfComparable<T> {
    int compareTo(T o); // any class that implements this interface needs to implement the compareTo method
}

class Student implements Comparable<Student> { // important to remember is that interface can be a generic
    int gradeAvg;
    public Student(int gradeAvg){
        this.gradeAvg = gradeAvg;
    }

    @Override
    public int compareTo(Student student){
        Student other = student;

        if(other.gradeAvg > this.gradeAvg){
            return 1;
        } else if (other.gradeAvg < this.gradeAvg) {
            return -1;
        }
        return 0;
    }
}

// Creating own comperator
class StudentGPAComparator implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2){
        if(student1.gradeAvg > student2.gradeAvg){
            return 1;
        } else if (student1.gradeAvg > student2.gradeAvg) {
            return -1;
        }
        return 0;
    }
}