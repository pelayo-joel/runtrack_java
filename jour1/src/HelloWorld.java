import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Veuillir saisir votre nom: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}