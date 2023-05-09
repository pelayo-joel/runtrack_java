import java.util.Scanner;

public class StringSwap {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in); 
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter two strings: ");

        String chaine1 = input1.nextLine(); String chaine2 = input2.nextLine();
        System.out.println("Chaine 1: " + chaine1 + ", Chaine 2: " + chaine2);

        chaine1 += chaine2;       
        chaine2 = chaine1.substring(0, (chaine1.length() - chaine2.length()));       
        chaine1 = chaine1.substring(chaine2.length());
        System.out.println("Chaine 1: " + chaine1 + ", Chaine 2: " + chaine2);
    }
}