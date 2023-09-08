package src.jour3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamChainesExercice {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<String>();
        List<String> strInput = new ArrayList<>();
        for (String integer : args) {
            strInput.add(integer);
        }


        Stream<String> stream = strInput.stream();
        stream.forEach(value -> {
            if (Character.toLowerCase(value.charAt(0)) == 'a' && value.length() == 3) {
                result.add(value);
            }
        });


        System.out.print("Mots filtres: ");
        for (String newValue : result) {
            System.out.print(newValue);
            if (!(result.indexOf(newValue) == (result.size() - 1))) {
                System.out.print(", ");
            }
        } 
    }
}
