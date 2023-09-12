package src.jour5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollectExercice {
    public static void main(String[] args) {
        List<Integer> intInput = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            intInput.add(Integer.parseInt(args[i]));
        }

        System.out.print("Nombres inferieurs a " + args[0] + ":");
        Stream<Integer> stream = intInput.stream();
        stream.forEach(value -> {
            if (value < Integer.parseInt(args[0])) {
                System.out.print(" " + value + ",");
            }
        });
    }
}
