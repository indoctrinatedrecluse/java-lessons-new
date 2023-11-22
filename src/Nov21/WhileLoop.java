package Nov21;

public class WhileLoop {
    // You use a while loop when you have no idea when you have no idea how long the loop is going to run.
    // The most classic example is using a while loop to count the digits of a number.

    public static int countDigits (int number) {
        int count = 0;
        if (number == 0) return 1;
        while (number > 0) {
            number /= 10;
            count ++;
        }
        return count;
    }

    public static int sumOfDigits (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main (String[] args) {
        System.out.println(WhileLoop.countDigits(54));
        System.out.println(WhileLoop.countDigits(10));
        System.out.println(WhileLoop.sumOfDigits(54));
        System.out.println(WhileLoop.sumOfDigits(10));
    }
}
