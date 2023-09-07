package src.jour2;

import java.io.EOFException;

public class DivisionExercice {
    public static void main(String[] args) {
        try {
            System.out.println("Resultat: " + (Integer.parseInt(args[0]) / Integer.parseInt(args[1])));
        } catch (Exception e) {
            System.out.println("Erreur: DivisionParZeroException.");
        }
    }
}
