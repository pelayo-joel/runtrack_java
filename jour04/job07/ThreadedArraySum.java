import java.util.Scanner;
import java.util.ArrayList; import java.util.Arrays;

public class ThreadedArraySum {
    public static void main(String[] args) {
        System.out.println("Enter a length of value to sum: ");
        Scanner inputLength = new Scanner(System.in);
        System.out.println("Enter a number of threads to use: ");
        Scanner inputThreads = new Scanner(System.in);

        int arrayLength = inputLength.nextInt();
        int nThreads = inputThreads.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++){
            System.out.print("Value " + (i+1) + ": ");
            Scanner inputNum = new Scanner(System.in);
            int num = inputNum.nextInt();
            numbers.add(num);
        }

        long start = System.nanoTime();

        long sum = 0;
        int segment = arrayLength / nThreads;
        
        ArrayList<Threading> threadList = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nThreads; i+=segment) {
            int[] arraySegment = new int[segment];
            for (int j = 0; j < segment; j++){
                arraySegment[j] = numbers.get(index);
                index++;
            }
            Threading thread = new Threading();
            threadList.add(thread);
            thread.run(arraySegment);
        }

        for (Threading thread : threadList) {
            sum += thread.getSum();
        }

        long end = System.nanoTime();
        double milli = end - start;
        System.out.println("Sum: " + sum);
        System.out.println("Main method execution time in milliseconds to sum all numbers: " + (milli / 1000000) + "ms");
        System.out.println("Main method execution time in seconds to sum all numbers: " + (milli / 1000000000) + "s");
    }
}