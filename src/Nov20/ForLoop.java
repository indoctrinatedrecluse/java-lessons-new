package Nov20;

import java.lang.reflect.Array;

public class ForLoop {
    // Sum up the first n Natural numbers (1 + 2 + 3 + ... + n)
    // Do it in 3 distinct ways.

    // 1. Using a for loop
    public static int sum1 (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Using recursion
    public static int sum2 (int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum2(n - 1);
    }

    // 3. Work it out mathematically
    public static int sum3 (int n) {
        return n * (n + 1) / 2;
    }

    public static void main (String[] args) {
        int n = 5;
        System.out.println(sum1(n));
        System.out.println(sum2(n));
        System.out.println(sum3(n));
    }
}
