#include <iostream>

using namespace std;

int main()
{
    int a = 10;
    int b = 20;
    int c = 30;

    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "c = " << c << endl;

    // Arithmetic Operators
    cout << "a + b = " << a + b << endl;
    cout << "a - b = " << a - b << endl;
    cout << "a * b = " << a * b << endl;
    cout << "a / b = " << a / b << endl;
    cout << "a % b = " << a % b << endl;

    // Relational Operators
    cout << "a == b = " << (a == b) << endl;
    cout << "a != b = " << (a != b) << endl;
    cout << "a > b = " << (a > b) << endl;
    cout << "a < b = " << (a < b) << endl;
    cout << "a >= b = " << (a >= b) << endl;
    cout << "a <= b = " << (a <= b) << endl;

    // Logical Operators
    cout << "a && b = " << (a && b) << endl;
    cout << "a || b = " << (a || b) << endl;
    cout << "!a = " << !a << endl;

    // Bitwise Operators
    cout << "a & b = " << (a & b) << endl;
    cout << "a | b = " << (a | b) << endl;
    cout << "a ^ b = " << (a ^ b) << endl;
    cout << "~a = " << ~a << endl;
    cout << "a << 2 = " << (a << 2) << endl;
    cout << "a >> 2 = " << (a >> 2) << endl;

    // Assignment Operators
    cout << "a = b = c = 100" << endl;
    a = b = c = 100;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "c = " << c << endl;

    cout << "a += 10" << endl;
    a += 10;
    cout << "a = " << a << endl;

    cout << "a -= 10" << endl;
    a -= 10;
    cout << "a = " << a << endl;
    
    cout << "a *= 10" << endl;
    a *= 10;
    cout << "a = " << a << endl;

    cout << "a /= 10" << endl;
    a /= 10;
    cout << "a = " << a << endl;

    cout << "a %= 10" << endl;
    a %= 10;
    cout << "a = " << a << endl;

    // Increment and Decrement Operators
    cout << "a = " << a << endl;
    cout << "a++ = " << a++ << endl;
    cout << "a = " << a << endl;
    cout << "++a = " << ++a << endl;
    cout << "a = " << a << endl;
    cout << "a-- = " << a-- << endl;
    cout << "a = " << a << endl;
    cout << "--a = " << --a << endl;
    cout << "a = " << a << endl;

    // Ternary Operator
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "a > b ? a : b = " << (a > b ? a : b) << endl;

    return 0;
}