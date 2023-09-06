import java.util.Random;
import java.util.concurrent.TimeUnit;


public class JeuDeDes {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int firstDice = rand.nextInt(6);
        int secondDice = rand.nextInt(6);

        try {
            System.out.println("Dé 1: " + firstDice);
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Dé 2: " + secondDice);
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Somme: " + (firstDice + secondDice));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
