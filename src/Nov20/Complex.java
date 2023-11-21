package Nov20;

class ComplexNumber {
    // Complex numbers are numbers of the form a + bi, where a and b are real numbers and i is the imaginary unit
    // a is called the real part and b is called the imaginary part
    // a and b are both real numbers

    // class variables
    private double real;
    private double imaginary;

    // setters and getters
    public void setReal (double real) {
        this.real = real;
    }

    public double getReal () {
        return this.real;
    }

    public void setImaginary (double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary () {
        return this.imaginary;
    }

    // constructors

    // default constructor
    public ComplexNumber () {
        this.real = 0;
        this.imaginary = 0;
    }

    // parameterized constructor
    public ComplexNumber (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // copy constructor
    public ComplexNumber (ComplexNumber c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // methods

    // we are overloading the default add method
    public static ComplexNumber add (ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    // we are overloading the default subtract method
    public static ComplexNumber subtract (ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    // we are overloading the default multiply method
    public static ComplexNumber multiply (ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.real * c2.real - c1.imaginary * c2.imaginary, c1.real * c2.imaginary + c1.imaginary * c2.real);
    }

    // we are overloading the default divide method
    public static ComplexNumber divide (ComplexNumber c1, ComplexNumber c2) {
        double denominator = c2.real * c2.real + c2.imaginary * c2.imaginary;
        // this is callled the ternary operator, it is a shorthand for if-else statements
        return denominator == 0 ? null : new ComplexNumber((c1.real * c2.real + c1.imaginary * c2.imaginary) / denominator, (c1.imaginary * c2.real - c1.real * c2.imaginary) / denominator);
    }

    // we are overloading the default toString method
    public String toString () {
        return this.real + " + " + this.imaginary + "i";
    }
}


public class Complex {
    public static void main (String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);
        // as you can see here, operator overloading is not supported in Java
        // we can only overload what's called the 'magic methods' in Python
        ComplexNumber c3 = ComplexNumber.add(c1, c2);
        ComplexNumber c4 = ComplexNumber.subtract(c1, c2);
        ComplexNumber c5 = ComplexNumber.multiply(c1, c2);
        ComplexNumber c6 = ComplexNumber.divide(c1, c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
    }
}