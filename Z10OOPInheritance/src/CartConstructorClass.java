public class CartConstructorClass {
    private String type;
    private double moneyAmount;
    private double initialBonus;
    private String name;

    // constructor is used in the creation of the object, it can set initial parameters of that object
    // constructor is implicitly created by java, when we use 'new' keyword we are calling the constructor

    // if we don't define a constructor java will create a default one. It has no args and is called "no argument constructor".
    // if a class contains a constructor, java will not create a default constructor

    // constructor needs to have same name as our class declaration
    // constructor CANNOT have a return type not EVEN A VOID
    public CartConstructorClass(){
        System.out.println("calling constructor from cart");
        // we can do anything we want here when the object is being instanciated.
        // class can have more than one constructor
    }

    // class can have more than one constructor
    // having multiple constructors is called constructor overloading
    // we can also generate this with intelij in generate -> constructor
    public CartConstructorClass(String type, double moneyAmount, double initialBonus, String userName){
        setType(type); // if we have validators, we can put them in setters and still use our setters in constructors. However this wont work if we have inheritance to well
        this.moneyAmount = moneyAmount;
        this.initialBonus = initialBonus;
        name = userName; //if for some reason the argument name and the field name on class differ, we don't have to use this
    }

    public CartConstructorClass(String type, double moneyAmount){
       this(type,moneyAmount, 0, "John Doe"); // this is a way of calling the 4 args constructor above. Thanks to this we can add default values
    }

    public void setType(String type){
        switch (type){
            case "cloths":{
                this.type = type;
            }
            default: {
                System.out.println("unknown type");
            }
        }
    }
}
