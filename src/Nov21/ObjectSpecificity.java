package Nov21;

import java.util.ArrayList;

public class ObjectSpecificity {
    // This is an example of both constructor overloading and specificity.
    // Overloading means having multiple methods (or constructors) with the same names.
    // To let the compiler differentiate them, they must have\
    // either a different number or type or parameters, or both.

    // Class variables
    private int value;

    // Default constructor
    public ObjectSpecificity() {
        value = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructors
    public ObjectSpecificity(int value) {
        this.value = value;
        System.out.println("Parameterized constructor 1 called");
    }

    public ObjectSpecificity(String value) {
        this.value = Integer.parseInt(value);
        System.out.println("Parameterized constructor 2 called");
    }

    public ObjectSpecificity(Object o) {
        value = 0;
        System.out.println("Parameterized constructor 3 called");
    }

    public ObjectSpecificity(int value, int offset) {
        this.value = (value + offset);
        System.out.println("Parameterized constructor 4 called");
    }

    // Copy constructor
    public ObjectSpecificity(ObjectSpecificity obj) {
        value = obj.value;
        System.out.println("Copy constructor called");
    }

    public static void main (String[] args) {
        // Create objects of different types
        ObjectSpecificity obj1 = new ObjectSpecificity();
        ObjectSpecificity obj2 = new ObjectSpecificity(5);
        ObjectSpecificity obj3 = new ObjectSpecificity(5, 6);
        ObjectSpecificity obj4 = new ObjectSpecificity("7");
        ObjectSpecificity obj5 = new ObjectSpecificity(obj4);
        ObjectSpecificity obj6 = new ObjectSpecificity(new ArrayList<Integer>());
    }
}
