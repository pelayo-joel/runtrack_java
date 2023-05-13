import java.util.Scanner;
import java.util.ArrayList;

public class PotentialForkBomb {
    public static void main(String[] args) {
        System.out.println("Enter a number of threads to use: ");
        Scanner inputThreads = new Scanner(System.in);
        int nThreads = inputThreads.nextInt();

        long start = System.nanoTime();
        long segment = (long) 10000000 / nThreads;

        ArrayList<Threading> threadList = new ArrayList<>();
        for (int i = 1; i <= nThreads; i++) {
            Threading thread = new Threading();
            thread.run(((i - 1) * segment), (i * segment), i);
            threadList.add(thread);
        }

        long sum = 0;
        for (Threading thread : threadList) {
            System.out.println("Sum from thread " + thread.threadID + ": " + thread.getSum());
            System.out.println("Time execution for thread " + thread.threadID + " in milliseconds: " + (thread.getTimeExec() / 1000000) + "ms");
            
            sum += thread.getSum();
            System.out.println("Current sum: " + sum + "\n");
        }

        long end = System.nanoTime();
        double milli = end - start;
        System.out.println("Sum: " + sum);
        System.out.println("Main method execution time in milliseconds to sum each value from 0 up to 10000000: " + (milli / 1000000) + "ms");
        System.out.println("Main method execution time in seconds to sum each value from 0 up to 10000000: " + (milli / 1000000000) + "s");
    }
}