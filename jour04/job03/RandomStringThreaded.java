import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.File; import java.io.FileWriter; import java.io.IOException; 

public class RandomStringThreaded {    
    public static void main(String[] args) {
        System.out.println("Enter a length for the random string: ");
        Scanner inputLength = new Scanner(System.in);
        System.out.println("Enter a number of threads to use: ");
        Scanner inputThreads = new Scanner(System.in);

        long strLength = inputLength.nextLong();
        int nThreads = inputThreads.nextInt();
        long segmentLength = strLength / (long) nThreads;

        double start = System.nanoTime();
        String fileOutput = "";

        ArrayList<StringThreads> threadList = new ArrayList<>();
        for (int i = 0; i < nThreads; i++){
            StringThreads strSegment = new StringThreads();
            threadList.add(strSegment);
            strSegment.run(segmentLength);
        }

        for (StringThreads thread : threadList) {
            fileOutput += thread.getSegment();
        }


        try {
            File myFile = new File("output.txt");
            if (myFile.createNewFile()) { System.out.println("File created: " + myFile.getName()); } 
            else { System.out.println("File already exists."); }

            FileWriter myWriter = new FileWriter("output.txt");
            myWriter.write(fileOutput);
            myWriter.close();
            long end = System.nanoTime();

            double milli = end - start;
            System.out.println("Main method execution time in milliseconds: " + (milli / 1000000) + "ms");
            System.out.println("Main method execution time in seconds: " + (milli / 1000000000) + "s");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}