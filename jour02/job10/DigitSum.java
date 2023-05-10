import java.util.Scanner;

public class DigitSum {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String number = input.nextLine(); int result = 0;
        for (int i = 0; i < number.length(); i++){
            result += Character.getNumericValue(number.charAt(i));
        }

        System.out.println("La somme des chiffres est: " + result);
    }
}