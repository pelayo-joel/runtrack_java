import java.util.Scanner;
import java.util.ArrayList;

public class ThreadedCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to count from 0: ");
        long num = input.nextLong();

        System.out.println("Enter a number of threads to use: ");
        Scanner inputThreads = new Scanner(System.in);
        int nThreads = inputThreads.nextInt();

        long start = System.nanoTime();
        long segment = (long) num / nThreads;

        ArrayList<Threading> threadList = new ArrayList<>();
        for (int i = 0; i < nThreads; i++) {
            Threading thread = new Threading();
            threadList.add(thread);
            thread.run(segment);
        }

        long end = System.nanoTime();
        double milli = end - start;
        System.out.println("Main method execution time in milliseconds to count from 0 up to " + num + ": " + (milli / 1000000) + "ms");
        System.out.println("Main method execution time in seconds to count from 0 up to " + num + ": " + (milli / 1000000000) + "s");
    }
}