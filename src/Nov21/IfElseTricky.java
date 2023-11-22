package Nov21;

public class IfElseTricky {
    public static void main (String[] args) {
        int value;

        // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int random = (int)(Math.random() * range) + min;

        if (random > 5) {
            value = 1;
        }
        else if (random <= 5) {
            value = 0;
        }

        // This is not going to compile because even though we know this is an exclusive range,
        // the Java Compiler cannot identify this and thinks there may be another condition
        // where @param:value ends up uninitialized.
        System.out.println(value);
    }
}
