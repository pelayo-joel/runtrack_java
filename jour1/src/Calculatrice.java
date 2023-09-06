import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        System.out.println("Entrez le premier nombre: ");
        Scanner firstInput = new Scanner(System.in); 
        System.out.println("Entrez le second nombre: ");
        Scanner secondInput = new Scanner(System.in);

        int firstNum = firstInput.nextInt(), secondNum = secondInput.nextInt();
        System.out.println("Somme: " + (firstNum + secondNum));
        System.out.println("Différence: " + (firstNum - secondNum));
        System.out.println("Produit: " + (firstNum * secondNum));
        System.out.println("Division: " + (firstNum / secondNum));
    }
}
