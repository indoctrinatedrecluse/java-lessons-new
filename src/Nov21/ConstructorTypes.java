package Nov21;

public class ConstructorTypes {
    // Class variables
    int id;
    String description;

    // default constructor
    public ConstructorTypes () {
        id = 0;
        description = "";
        System.out.println("Default Constructor called");
    }

    // parameterized constructor
    public ConstructorTypes (int id, String description) {
        this.id = id;
        this.description = description;
        System.out.println("Parameterized Constructor called");
    }

    // copy constructor
    public ConstructorTypes (ConstructorTypes obj) {
        id = obj.id;
        description = obj.description;
        System.out.println("Copy Constructor called");
    }

    public static void main (String[] args) {
        // Create three different types of objects
        ConstructorTypes obj1 = new ConstructorTypes();
        ConstructorTypes obj2 = new ConstructorTypes(5, "Chocolate");
        ConstructorTypes obj3 = new ConstructorTypes(obj2);
    }
}
