import java.util.Map;
import java.util.HashMap;

public class Occurences {
    public static void main (String[] args){
        //Initialize the test array
        int[] values = {3, 7, 3, 9, 8};

        //Using a map to store pairs between each value and their occurences
        Map<Integer, Integer> valueOccurences = new HashMap<>();
        for (int value : values){
            if (!valueOccurences.containsKey(value)){valueOccurences.put(value, 1);}
            else {valueOccurences.put(value, valueOccurences.get(value) + 1);}
        }

        //Print occurences of values that appears more than once in 'values'
        for (Integer value : valueOccurences.keySet()){
            if (valueOccurences.get(value) > 1) { System.out.println("Occurences of " + value + " in test array: " + valueOccurences.get(value)); }
        }
    }
}