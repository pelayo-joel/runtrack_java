package src.jour3;

import java.util.ArrayList;

public class ListeEntiersExercice {
    public static void main(String[] args) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        int result = 0;

        for(int i = 0; i < args.length; i++) {
            try {
                int argInput = Integer.parseInt(args[i]);
                if (argInput % 2 == 0) {
                    result += argInput;
                    evenList.add(argInput);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        System.out.println("Somme des nombres pairs: " + result);
    }
}
