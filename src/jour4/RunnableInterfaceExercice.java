package src.jour4;

import java.lang.Thread;


public class RunnableInterfaceExercice extends Thread implements Runnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("En cours d'execution...");
                        Thread.currentThread().sleep(1000);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
