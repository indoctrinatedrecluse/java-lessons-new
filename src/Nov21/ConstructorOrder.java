package Nov21;

class A {
    public A() {
        System.out.println("Constructor A called");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor B called");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constructor C called");
    }
}

public class ConstructorOrder {
    // This class is to show in which order constructors are called during inheritance.
    public static void main (String[] args) {
        C c = new C();
    }
}
