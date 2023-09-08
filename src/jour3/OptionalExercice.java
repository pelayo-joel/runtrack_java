package src.jour3;

import java.util.Optional;

public class OptionalExercice {
    public static void main(String[] args) {
        try {
            Optional<String> optParam = Optional.ofNullable(args[0]);
            if (optParam.isPresent()) {
                System.out.println("Longueur de la chaine fournie: " + optParam.get().length());
            }
        } catch (Exception e) {
            System.out.println("Chaine non fournie");
        }
    }
}
