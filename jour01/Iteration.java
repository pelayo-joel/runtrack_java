import java.util.Scanner;

public class Iteration{
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        String input = userInput.nextLine();
        int userNumber = Integer.parseInt(input);
        for (int i = 0; i <= userNumber; i++){
            System.out.println(i);
        }
    }
}