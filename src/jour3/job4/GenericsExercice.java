package src.jour3.job4;

public class GenericsExercice {
    public static void main(String[] args) {
        if (args[0].toLowerCase().equals("string")) {
            Boite<String> genericBox = new Boite<String>(args[1]);
            genericBox.PrintData();
        }
        else if (args[0].toLowerCase().equals("int")) {
            try {
                Boite<Integer> genericBox = new Boite<Integer>(Integer.parseInt(args[1]));
                genericBox.PrintData();
            } catch (Exception e) {
                System.out.println("Erreur: MauvaisType");
            }
        }
    }
}
