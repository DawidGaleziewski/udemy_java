```java
// we should not repeat ourselves in constructors, we should use constructor chaining as much as possicle
// this is how we can refactor bad constructors into good ones
class Rectangle {
    // 1st constructor
    public Rectangle(){
//        this.x = x; // we do not want to repeat ourselves here
//        this.y = y;
//        this.width = width;
//        this.height = height;
        this(0 ,0); // calls 2nd constructor // calling class constructor of current class with specific signature
    }
    
    // 2nd constructor
    public Rectangle(int width, int height){
//        this.x = x; // We do not have to repeat ourselves and assing those fields. We should use this constructor and laverage previous code
//        this.y = y;
//        this.width = width;
//        this.height = height;
        this(0,0, width, height); // calls 3rd constructor
    }
    
    // 3rd constructor 
    public Rectangle(int x, int y, int width, int height){
        // initialize variables. Variables should always be initialized in the last, 3rd constructor
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
```


```java
class Shape {
    private int x;
    private int y;
    
    // 3rd constructor
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;
    
    
    // 1st constructor
    public Rectangle (int x, int y) {
        this(x, y, 0 ,0); // calling 2nd constructor
    }
    
    // 2nd constructor
    public Rectangle(int x, int y, int width, int height){
        super(x, y); // calling the 3rd constructor in our parent class
        this.width = width; // assigment of extra values to the field
        this.height = height;
    }
}
```