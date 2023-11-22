#include <iostream>
#include <fstream>

using namespace std;

int main () {
    // ofstream is used to write to a file
    // ofstream file("test.txt");
    ofstream file;
    file.open("test.txt");

    file << "Hello World!" << endl;
    file << "This is a test file." << endl;

    file.close();

    // ifstream is used to read from a file
    // ifstream file1("test.txt");
    ifstream file1;
    file.open("test.txt");

    string line;
    while (getline(file1, line)) {
        cout << line << endl;
    }

    file1.close();

    // fstream is used to read and write to a file
    // fstream file2("test.txt");
    fstream file2;
    file.open("test.txt", ios::in | ios::out | ios::app);

    // Write to the end of the file
    file2 << "This is a new line." << endl;
    // Read from the beginning of the file
    file2.seekg(0, ios::beg);

    while (getline(file2, line)) {
        cout << line << endl;
    }

    file2.close();

    // The more basic way to access files in C++ is using a FILE pointer

    // Read from a file
    FILE *file3 = fopen("test.txt", "r");
    char buffer[100];
    while (fgets(buffer, 100, file3)) {
        cout << buffer << endl;
    }

    fclose(file3);

    // Write to a file
    FILE *file4 = fopen("test.txt", "w");
    fputs("Hello World!", file4);
    fclose(file4);

    // Both read and write at the same time is also possible
    FILE *file5 = fopen("test.txt", "r+");
    fputs("Hello World!", file5);
    fclose(file5);

    // Append to a file
    FILE *file6 = fopen("test.txt", "a");
    fputs("Hello World!", file6);
    fclose(file6);

    return 0;
}