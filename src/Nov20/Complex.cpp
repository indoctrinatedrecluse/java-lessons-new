// The same as Complex.java, but with operator overloading in C++.

#include <iostream>

using namespace std;

typedef struct ComplexNumber {
    double real;
    double imaginary;

    // In C++, we can overload operators.

    // Overload the + operator.
    ComplexNumber operator+(ComplexNumber other) {
        ComplexNumber result;
        result.real = real + other.real;
        result.imaginary = imaginary + other.imaginary;
        return result;
    }

    // Overload the - operator.
    ComplexNumber operator-(ComplexNumber other) {
        ComplexNumber result;
        result.real = real - other.real;
        result.imaginary = imaginary - other.imaginary;
        return result;
    }

    // Overload the * operator.
    ComplexNumber operator*(ComplexNumber other) {
        ComplexNumber result;
        result.real = real * other.real - imaginary * other.imaginary;
        result.imaginary = real * other.imaginary + imaginary * other.real;
        return result;
    }

    // Overload the / operator.
    ComplexNumber operator/(ComplexNumber other) {
        ComplexNumber result;
        result.real = (real * other.real + imaginary * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary);
        result.imaginary = (imaginary * other.real - real * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary);
        return result;
    }

    // Overload the << operator.
    friend ostream& operator<<(ostream& os, const ComplexNumber& number) {
        os << number.real << " + " << number.imaginary << "i";
        return os;
    }
} Complex;

int main() {
    Complex a, b;
    a.real = 1;
    a.imaginary = 2;
    b.real = 3;
    b.imaginary = 4;

    Complex c = a + b;
    cout << c << endl;

    Complex d = a - b;
    cout << d << endl;

    Complex e = a * b;
    cout << e << endl;

    Complex f = a / b;
    cout << f << endl;

    return 0;
}