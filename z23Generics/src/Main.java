public class Main {
    public static void main(String[] args) {
        //using generic class
        // Catapult is a reference type, String is type parameter and string catapult is variable name
        Catapult<Cow> cowCatapult = new Catapult<>(); // we can leave the type parameter empty here, this is called diamond operator and is a shorthand, java will infer the type here to be initialized
    }
}

// java supports both generic classes, interfaces and methods
//
class Catapult<T>{ // T is a type identifier
    private T load;
}

class Cow {
}