package src.jour2;

import java.io.EOFException;

public class VoitureExercice {
    public static void main(String[] args) {
        try {
            int speed = Integer.parseInt(args[0]);
            if (speed > 100) {
                throw new EOFException();
            }
            System.out.println("Vitesse de la voiture: " + speed);
        } catch (Exception e) {
            System.out.println("Erreur: VitesseLimiteDepasseeException.");
        }
    }
}
