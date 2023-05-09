import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){
        Scanner name = new Scanner(System.in); 
        System.out.println("Enter name: ");
        Scanner firstName = new Scanner(System.in);
        System.out.println("Enter first name: ");

        String nom = name.nextLine();
        String prenom = firstName.nextLine();
        System.out.println(nom + " " + prenom);
    }
}