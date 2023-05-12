import java.util.Scanner;
import java.util.ArrayList;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Enter a length of value to sum: ");
        Scanner inputLength = new Scanner(System.in);
        int arrayLength = inputLength.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++){
            System.out.print("Value " + (i+1) + ": ");
            Scanner inputNum = new Scanner(System.in);
            int num = inputNum.nextInt();
            numbers.add(num);
        }

        long start = System.nanoTime();
        long sum = 0;
        for (long value : numbers) {
            sum += value;
        }

        long end = System.nanoTime();
        double milli = end - start;
        System.out.println("Sum: " + sum);
        System.out.println("Main method execution time in milliseconds to sum all numbers: " + (milli / 1000000) + "ms");
        System.out.println("Main method execution time in seconds to sum all numbers: " + (milli / 1000000000) + "s");
    }
}