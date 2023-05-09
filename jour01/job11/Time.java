import java.util.Scanner;

public class Time {
    public static void main (String[] args){
        Scanner timeInput = new Scanner(System.in);
        System.out.print("Entrez une duree en minutes: ");

        String inputStr = timeInput.nextLine();
        int input = Integer.parseInt(inputStr);
        int heures = input / 60;
        int minutes = input - (60 * heures);

        System.out.println(input + " minutes est equivalent a " + heures + " heures et " + minutes + " minutes");
    }
}