package src.jour3;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;


public class StreamsOperationExercice {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        List<Integer> intInput = new ArrayList<>();
        for (String integer : args) {
            intInput.add(Integer.parseInt(integer));
        }


        Stream<Integer> stream = intInput.stream();
        stream.forEach(value -> {
            if (!(value * 2 > 10)) {
                value *= 2;
                result.add(value);
            }
        });


        System.out.print("Resultat: [");
        for (int newValue : result) {
            System.out.print(newValue);
            if (!(result.indexOf(newValue) == (result.size() - 1))) {
                System.out.print(", ");
            }
        } 
        System.out.print("]");
    }
}