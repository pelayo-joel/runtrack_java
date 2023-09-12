package src.jour5;

import java.util.ArrayList;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        ArrayList<String> resultArray = new ArrayList<String>();
        for (int i = 0; i < args.length; i++) {
            resultArray.add(args[i]);
        }

        for (String element : resultArray) {
            System.out.println(element);
        }
    }
}
