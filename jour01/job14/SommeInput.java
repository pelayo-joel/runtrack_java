import java.util.Scanner;

public class SommeInput{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in); 
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter two integer: ");

        String strInput1 = input1.nextLine(); String strInput2 = input2.nextLine();
        int num1 = Integer.parseInt(strInput1); int num2 = Integer.parseInt(strInput2);
        System.out.println("Sum: " + (num1 + num2));
    }
}