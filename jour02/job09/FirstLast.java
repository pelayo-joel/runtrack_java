import java.util.Scanner;

public class FirstLast {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String number = input.nextLine();
        System.out.println("Le premier chiffre de " + number + " est: " + number.charAt(0));
        System.out.println("Le dernier chiffre de " + number + " est: " + number.charAt(number.length() - 1));
    }
}