package src.jour4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CallableFutureExercice {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> {
            return Integer.parseInt(args[0]) * Integer.parseInt(args[1]);            
        };
        Future<Integer> futureCallable = service.submit(task);
        int result = futureCallable.get();

        System.out.println("Resultat de la multiplication: " + result);
        service.shutdown();
    }
}
