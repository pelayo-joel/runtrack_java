package src.jour5;

public class LambdaArgumentExercice {
    public static void main(String[] args) {
        if (args[0].length() > Integer.parseInt(args[1])) {
            System.out.println("La chaine " + args[0] + " a une longueur superieur a " + args[1]);    
        } 
        else {
            System.out.println("La chaine " + args[0] + " a une longueur inferieur ou egale a " + args[1]);
        }
    }
}
