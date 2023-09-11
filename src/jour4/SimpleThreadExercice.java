package src.jour4;

public class SimpleThreadExercice extends Thread {
    public static void main(String[] args) {
        SimpleThreadExercice myThread = new SimpleThreadExercice();
        myThread.run();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Salut du thread !");
        }
    }
}