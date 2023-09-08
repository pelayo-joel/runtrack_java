package src.jour3;

import java.util.ArrayList;

public class MotsUniquesExercice {
    public static void main(String[] args) {
        ArrayList<String> uniqueWords = new ArrayList<String>();
        System.out.print("Mots uniques:");

        for(int i = 0; i < args.length; i++) {
            if (!uniqueWords.contains(args[i])) {
                System.out.print(" " + args[i]);
                uniqueWords.add(args[i]);
            }
        }
    }
}
