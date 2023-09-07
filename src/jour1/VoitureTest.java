package src.jour1;

import java.util.concurrent.TimeUnit;


public class VoitureTest {
    
    public static void main(String[] args) {
        String color = "RED";
        int idBrand = 2;
        int carSpeed = 10;

        try {
            System.out.println("La voiture démarre...");
            TimeUnit.SECONDS.sleep(3);
    
            carSpeed += 10;
            System.out.println("La voiture est maintenant de " + carSpeed + "km/h.");
            TimeUnit.SECONDS.sleep(2);
            carSpeed += 10;
            System.out.println("La voiture est maintenant de " + carSpeed + "km/h.");
            TimeUnit.SECONDS.sleep(3);
    
            carSpeed = 0;
            System.out.println("La voiture s'arrête. Vitesse réinitialisée à 0km/h.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}