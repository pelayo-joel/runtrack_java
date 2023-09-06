import java.util.ArrayList;
import java.util.Scanner;

public class EtudiantTest {
    private static ArrayList<Float> studentScores = new ArrayList<Float>();

    public static void main(String[] args) {
        while(true) {
            System.out.println("Entrez une commande (exit, add, best, worst, avg): ");
            Scanner input = new Scanner(System.in);
            String userCommand = input.nextLine(); 

            if (userCommand.equals("exit")) {
                System.exit(0);
            } 
            else if(userCommand.equals("add")) {
                EtudiantTest.addScore();
            } 
            else if(userCommand.equals("best")) {
                EtudiantTest.printBest();
            } 
            else if(userCommand.equals("worst")) {
                EtudiantTest.printWorst();
            } 
            else if(userCommand.equals("avg")) {
                EtudiantTest.printAvg();
            } 
            else {
                System.out.println("Invalid input");
                continue;
            }
        }
    }



    private static void addScore() {
        System.out.print("Entrez une nouvelle note: ");
        Scanner valueInput = new Scanner(System.in);
        float value = valueInput.nextFloat();

        EtudiantTest.studentScores.add(value);
    }

    private static void printBest() {
        float bestScore = EtudiantTest.studentScores.get(0);
        for(int i = 1; i < EtudiantTest.studentScores.size() - 1; i++) {
            if (bestScore < EtudiantTest.studentScores.get(i)) {
                bestScore = EtudiantTest.studentScores.get(i);
            }
        }
        System.out.println("Note la plus haute: " + bestScore);
    }

    private static void printWorst() {
        float worstScore = EtudiantTest.studentScores.get(0);
        for(int i = 1; i < EtudiantTest.studentScores.size() - 1; i++) {
            if (worstScore > EtudiantTest.studentScores.get(i)) {
                worstScore = EtudiantTest.studentScores.get(i);
            }
        }    
        System.out.println("Note la plus haute: " + worstScore);
    }

    private static void printAvg() {
        float avg = 0.0f;
        for(int i = 0; i < EtudiantTest.studentScores.size() - 1; i++) {
            avg += EtudiantTest.studentScores.get(i);
        }   
        avg /= EtudiantTest.studentScores.size();
        System.out.println("Moyenne: " + avg);
    }
}
