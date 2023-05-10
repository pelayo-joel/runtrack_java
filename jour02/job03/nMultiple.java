import java.util.Scanner;

public class nMultiple {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " X " + number + " = " + (i * number));
        }
    }
}