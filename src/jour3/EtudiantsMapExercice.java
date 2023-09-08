package src.jour3;

import java.util.Map;
import java.util.HashMap;

public class EtudiantsMapExercice {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<Integer, String>();
        studentMap.put(101, "Pierre");
        studentMap.put(102, "Marie");
        studentMap.put(103, "Jean");

        for(Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
