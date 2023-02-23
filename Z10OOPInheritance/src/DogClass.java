public class DogClass { // first letter of clas should be upper letter. Public keyword  will al
    // java allows us to use access modifiers to control class memebers

    // public - any other class on any level can access this class
    // protected - allows classes in the same package and any sublcasses in other packages to have access to the member
    // private - no other class ca access this member

    // good rule is to use private on all members until we need access to them. This is part of encapsulation principle

    // encapsulation in OOP has two meanings, one is bundling behaviour and attributes on a single object.
    // second is hiding fields and methods from public access
    private String race; // class fields are declared in class body
    private int age;
    private double weight;
    private String name;

    public void describeDog(){
        System.out.printf("Dog name is %s, its race is %s and its weight is %s", name, race, weight);
    }
}

// classes can be organized into logical groupings which are called packages.
// if we do not declare a package, the class implicitly belongs to default package.
// a class is called top-level class, if it is defined in the source code file, and not enclosed in the code block of another class, type, or methog
// classes that are public can be accessed by any other class in any other package
