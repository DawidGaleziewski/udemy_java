public class DogClass { // first letter of clas should be upper letter. Public keyword  will al
    // java allows us to use access modifiers to control class members

    // public - any other class on any level can access this class
    // protected - allows classes in the same package and any subcasses in other packages to have access to the member
    // private - no other class ca access this member

    // good rule is to use private on all members until we need access to them. This is part of encapsulation principle

    // encapsulation in OOP has two meanings, one is bundling behaviour and attributes on a single object.
    // second is hiding fields and methods from public access
    private String race; // class fields are declared in class body.
    // strings are objects and if not assigned any value will be asigned null
    private int age; // primitives will gave their owen default values like false, 0
    private double weight;
    private String name = "Fluffers"; //we can assign default values to our fields

    public void describeDog(){
        System.out.printf("Dog name is %s, its race is %s and its weight is %s \n", name, race, weight);
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        switch (race){
            case "beagle", "greyhound", "shiba" -> this.race = race;
            default -> {
                this.race = "Unknown";
            }
        }
        this.race = race;
    }

    public int getAge(){
        return age;
    }

    // creating getters and setters is a common practice in java and IntelliJ has a generate function to do this automagically
    public void setAge(int age){ // example of a setter method
        // setting values by setters is prefered in java as we can ad some validation to that fields
        if(age < 0){
            age = 0;
        }
        this.age = age; // "this" refers to the instance that was created when the object was instantiated.
    }
}

// classes can be organized into logical groupings which are called packages.
// if we do not declare a package, the class implicitly belongs to default package.
// a class is called top-level class, if it is defined in the source code file, and not enclosed in the code block of another class, type, or methog
// classes that are public can be accessed by any other class in any other package
