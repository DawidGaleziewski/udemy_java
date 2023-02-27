public class POJOClass { // Plain Old Java Object - class that generally only has instance fields
    // it is used to house data and pass data between functional classes.
    // usually it has only getters and setters
    // often used by database frameworks to read and write data
    // it is also called a bean, JavaBean, Entity (as it mirrors database entities), Data Transfer Object
    private  String id;
    private  String name;
    private String dateOfBirth;
    private String classList;

    public POJOClass(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    // overridden method is a not the same as overloaded method. It is a special method that other classes can implement if they use special method signature
    @Override // @ symbol is a used for annotations. Those are metadata that describe our code. They have more meaning then a comment, and can be used by complier to get further information about code.
    public String toString() { // to string is a special method in java that lets us convert the content of the object to string
        return "POJOClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    // getters and setters boilerplate
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
