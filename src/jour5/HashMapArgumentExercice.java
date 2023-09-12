package src.jour5;

import java.util.HashMap;
import java.util.Map;

public class HashMapArgumentExercice {
    public static void main(String[] args){
        HashMap<String, String> resultHashMap = new HashMap<String, String>();
        for (int i = 0; i < args.length; i+=2) {
            resultHashMap.put(args[i], args[i+1]);
        }

        for (Map.Entry<String, String> entry : resultHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
