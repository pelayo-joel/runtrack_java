import java.util.Scanner;

public class nDigits {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String number = input.nextLine();
        System.out.println("There's " + number.length() + " digit in your number");
    }
}