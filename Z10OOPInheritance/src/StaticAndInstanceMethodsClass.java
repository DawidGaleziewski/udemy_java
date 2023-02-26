public class StaticAndInstanceMethodsClass {

    String name;
    // static methods cant access intance methods and instance variables directly.
    // static methods have no access to 'this' keyword

    String getName(){
        return this.name;
    }

    // good practise is to use static methods, if we see a method that does nto require any instance variables
    static int getMyNumber(int number){
        // this would throw and error, as we cannot access a this keyword
    // this.name;

        // Same with instance method. Trying to use it in static method context will throw a error.
        // getName();

        return number;
    }
}
