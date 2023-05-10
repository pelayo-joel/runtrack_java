import java.util.Scanner;

public class AgeEmployment {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int userAge = input.nextInt();
        if (userAge < 16) { System.out.println("You can't work yet"); }
        else if (userAge > 55) { System.out.println("It'll be hard to work for you"); }
        else if (userAge > 67) { System.out.println("You're retired"); }
        else { System.out.println("You should be employed"); }
    }
}