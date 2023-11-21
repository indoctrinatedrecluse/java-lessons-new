package Nov20;

public class Calculator {
    // Let, for the sake of simplicity, assume that the calculator supports only two operands
    
    public static void add (int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract (int a, int b) {
        System.out.println(a - b);
    }

    public static void multiply (int a, int b) {
        System.out.println(a * b);
    }

    public static void divide (int a, int b) {
        System.out.println(a / b);
    }

    public static void modulo (int a, int b) {
        System.out.println(a % b);
    }

    public static void main (String[] args) {
        int a = 5;
        int b = 3;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        modulo(a, b);
    }
}
