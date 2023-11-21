package Sep29;

public class Variables {
    public static void main (String[] args) {
        int i = 32769;
        short s = (short) i;
        System.out.println(i + "," + s);
        System.out.println();

        // this is the only exception
        // when assigning values directly by equal sign, as long as the strings are equal,
        // the corresponding variables point to the same memory location.
        // this is because of "string pooling"
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        // however, if you use any other method (except =) to initialize the string,
        // they will always point to different memory locations
        String s3 = new String("Hello");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println();

        // Wrapper classes are classes which "wrap" around usually a datatype
        // and provide additional functionality to its objects
        // For example, int -> Integer, short -> Short, double -> Double
        int n1 = 5;
        int n2 = 5;
        System.out.println(n1 == n2);
        Integer i1 = new Integer(5);
        Integer i2 = 5;
        Integer i3 = 5;
        System.out.println(i1 == i2);
        // here the output is true because of "autoboxing"
        // it's the same as strings, however, for Integer objects, this only happens in the range -256 to 255
        System.out.println(i3 == i2);
        Integer i4 = 500;
        Integer i5 = 500;
        // if we exceed the range, they will point to different memory locations
        System.out.println(i4 == i5);
        System.out.println();
    }
}
