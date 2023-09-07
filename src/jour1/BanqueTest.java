package src.jour1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class BanqueTest {
    protected static double solde = 100;

    public static void main(String[] args) {
        while(true) {
            System.out.println("Entrez une commande (exit, -w, -d): ");
            Scanner input = new Scanner(System.in);
            String userCommand = input.nextLine(); 

            if (userCommand.equals("exit")) {
                System.exit(0);
            } 
            else if(userCommand.equals("-w")) {
                BanqueTest.withdraw();
            } 
            else if(userCommand.equals("-d")) {
                BanqueTest.deposit();
            } 
            else {
                System.out.println("Invalid input");
                continue;
            }
        }
    }



    private static void deposit() {
        System.out.print("Entrez une valeur de dépôt: ");
        Scanner valueInput = new Scanner(System.in);
        int value = valueInput.nextInt();

        try {
            System.out.println("Dépôt de " + value + "€... ");
            TimeUnit.SECONDS.sleep(2);
            
            BanqueTest.solde += value;
            System.out.println("Nouveau solde: " + BanqueTest.solde);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void withdraw() {
        System.out.print("Entrez une valeur de retrait: ");
        Scanner valueInput = new Scanner(System.in);
        int value = valueInput.nextInt();

        try {
            System.out.println("Tentative de retrait de " + value + "€... ");
            TimeUnit.SECONDS.sleep(2);
    
            if ((BanqueTest.solde - value) < 0) {
                System.out.print("Solde insuffisant!");
                return;
            }
            BanqueTest.solde -= value;
            System.out.println("Nouveau solde: " + BanqueTest.solde);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
