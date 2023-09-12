package src.jour5;

import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> resultSet = new HashSet<String>();
        for (int i = 0; i < args.length; i++) {
            resultSet.add(args[i]);
        }
        
        for (String element : resultSet) {
            if (!(resultSet.contains(element))) {
                System.out.println(element);
            }
        }
    }
}
