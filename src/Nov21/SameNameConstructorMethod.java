package Nov21;

public class SameNameConstructorMethod {
    static int value;

    public SameNameConstructorMethod() {
        value = 0;
    }

    public static void SameNameConstructorMethod() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        SameNameConstructorMethod obj = new SameNameConstructorMethod();
        SameNameConstructorMethod.SameNameConstructorMethod();
    }
}
