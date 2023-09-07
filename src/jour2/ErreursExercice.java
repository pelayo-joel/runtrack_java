package src.jour2;


public class ErreursExercice {
    public static void main(String[] args) {
        try {
            System.out.println("Resultat: " + (Integer.parseInt(args[0]) / Integer.parseInt(args[1])));
        } catch (NullPointerException nullError) {
            System.out.println("Erreur: NullPointerException.");
        } catch (ArrayIndexOutOfBoundsException rangeError) {
            System.out.println("Erreur: ArrayIndexOutOfBoundException.");
        } catch (ArithmeticException arithmeticError) {
            System.out.println("Erreur: ArithmeticException.");
        }
    }
}
