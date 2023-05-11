import java.util.Map;
import java.util.HashMap;


                //Based on job04//


public class Unique {
    public static void main (String[] args){
        //Initialize the test array
        int[] values = {3, 7, 3, 9, 8};

        //Using a map to store pairs between each value and their occurences
        Map<Integer, Integer> valueOccurences = new HashMap<>();
        for (int value : values){
            if (!valueOccurences.containsKey(value)){valueOccurences.put(value, 1);}
            else {valueOccurences.put(value, valueOccurences.get(value) + 1);}
        }

        //Print occurences of values that appears only once in 'values'
        for (Integer value : valueOccurences.keySet()){
            if (valueOccurences.get(value) < 2) { System.out.println(value + " is unique in test array"); }
        }
    }
}