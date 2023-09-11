package src.jour4;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ThreadInterruptionExercice {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<Void> task = () -> {
            try {
                Thread.currentThread().sleep((Integer.parseInt(args[0]) * 1000) / 2);
                System.out.println("Thread interrompu apres " + Integer.parseInt(args[0]) / 2 + " secondes!");
                return null;            
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        };
        Future<Void> futureCallable = service.submit(task);
        futureCallable.get();

        service.shutdown();
    }
}
