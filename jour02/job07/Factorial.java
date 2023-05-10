import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt(); int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }

        System.out.println("La factorielle du nombre " + number + " est " + result);
    }
}