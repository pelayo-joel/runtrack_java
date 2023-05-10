import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height: ");

        int number = input.nextInt();
        for (int i = 0; i <= number; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}