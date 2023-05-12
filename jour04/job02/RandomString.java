import java.util.Scanner;
import java.util.Random;
import java.io.File; import java.io.FileWriter; import java.io.IOException; 

public class RandomString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length for the random string: ");

        double start = System.nanoTime();
        int strLength = input.nextInt();
        String fileOutput = "";

        for (int i = 0; i < strLength; i++){
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            fileOutput += c;

            double time = System.nanoTime();
            if (((time - start) / 1000000000) > 10.0) { 
                System.out.println("Program timeout: " + ((time - start) / 1000000000) + "s");
                System.exit(0); 
            }
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