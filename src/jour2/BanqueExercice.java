package src.jour2;

import src.jour1.BanqueTest;


public class BanqueExercice extends BanqueTest {
    private static double epargne = 200;
    private static double rate = 0.02;
    public static void main(String[] args) {
        solde = Integer.valueOf(args[1]);
        epargne = Integer.valueOf(args[2]);

        System.out.println("Solde du compte courant: " + solde);
        System.out.println("Solde du compte epargne: " + epargne + " avec un taux d'interet de " + (rate * 10) + "%");
        System.out.println("Interets ajoutes: " + (epargne * rate) + ". Nouveau solde: " + (epargne + (epargne * rate)));
    }
}
