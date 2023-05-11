import java.util.Random;

public class RandomArray {
    public static void main (String[] args){
        //Initialize random array of length 10 with random values
        Random rand = new Random(); 
        int[] randomArray = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};

        //Print all values
        for (int i = 0; i < randomArray.length; i++) {
            System.out.println("Value at index " + i + ": " + randomArray[i]);
        }
    }
}