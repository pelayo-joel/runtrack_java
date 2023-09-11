package src.jour4;


import java.util.concurrent.*;

import java.util.Set;
import java.util.HashSet;
import java.util.List;


public class ExecutorServiceExercice {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        
        Set<Callable<Integer>> callableSet = new HashSet<Callable<Integer>>();
        callableSet.add(new Callable<Integer>() {
            public Integer call() {
                return Integer.parseInt(args[0]) * 1;
            }
        });
        callableSet.add(new Callable<Integer>() {
            public Integer call() {
                return Integer.parseInt(args[0]) * 2;
            }
        });
        callableSet.add(new Callable<Integer>() {
            public Integer call() {
                return Integer.parseInt(args[0]) * 3;
            }
        });

        List<Future<Integer>> futureList = service.invokeAll(callableSet);

        for (int i = 0; i < futureList.size(); i++) {
            System.out.println("Resultat de la tache " + i + ": " + futureList.get(i).get());
        }

        service.shutdown(); 
    }
}
