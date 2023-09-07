package src.jour2.job3;


public class AnimalExercice {
    private static Chat cat = new Chat();
    private static Chien dog = new Chien();
    private static Oiseau bird = new Oiseau();
    public static void main(String[] args) {
        cat.FaireDuBruit();
        dog.FaireDuBruit();
        bird.FaireDuBruit();
    }
}
