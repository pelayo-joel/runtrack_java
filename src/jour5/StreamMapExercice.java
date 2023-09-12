package src.jour5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExercice {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<String>();
        List<String> strInput = new ArrayList<>();
        for (String element : args) {
            strInput.add(element);
        }

        Stream<String> stream = strInput.stream();
        stream.forEach(value -> {
            result.add(value.toUpperCase());
        });

        for (String string : result) {
            System.out.println(string + ", ");
        }
    }
}
