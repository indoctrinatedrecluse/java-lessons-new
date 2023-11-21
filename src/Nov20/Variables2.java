package Nov20;

public class Variables2 {
    public static void main (String[] args) {
        // String pooling example
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        String s3 = s2;
        System.out.println(s1 == s3);

        // Example of implicit casting
        float f = 5.5f;
        double d = f;
        System.out.println(d);
        char c = 'a';
        int i = c;
        System.out.println(i);
        float f2 = i;
        System.out.println(f2);

        // Example of explicit casting
        double d2 = 5.7;
        float f3 = (float) d2;
        System.out.println(f3);
        int i2 = (int) d2;
        System.out.println(i2);

        // Example of wrapper classes
        int n1 = 5;
        int n2 = 5;
        System.out.println(n1 == n2);
        Integer i1 = new Integer(5);
        Integer i3 = 5;
        System.out.println(i1 == i3);
        Integer i4 = 500;
        Integer i5 = 500;
        System.out.println(i4 == i5);

        // Example of user defined types
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(arr1 == arr2);
        System.out.println(arr1.equals(arr2));

        // Example of more complicated conversions
        String s4 = "5";
        int i6 = Integer.parseInt(s4);
        System.out.println(i6);
        int i7 = 5;
        String s5 = Integer.toString(i7);
        System.out.println(s5);
        int i8 = 5;
        String s6 = "" + i8;
        System.out.println(s6);

        // Integer to boolean is not an implicit conversion in Java
        int i9 = 1;
        boolean b = (i9 == 1);
    }
}
