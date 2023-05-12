import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        long num = input.nextLong();
        long start = System.nanoTime();

        for (int i = 0; i < num; i++) {
            continue;
        }

        long end = System.nanoTime();
        double milli = end - start;
        System.out.println("Main method execution time in milliseconds to count from 0 up to " + num + ": " + (milli / 1000000) + "ms");
        System.out.println("Main method execution time in seconds to count from 0 up to " + num + ": " + (milli / 1000000000) + "s");
    }
}