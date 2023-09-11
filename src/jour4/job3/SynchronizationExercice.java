package src.jour4.job3;

public class SynchronizationExercice {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(Integer.parseInt(args[0]));
        
        Runnable runnable = new Runnable() {
            @Override
            public synchronized void run() {
                account.Withdraw(Integer.parseInt(args[1]));
                System.out.println(Thread.currentThread().getName() + " retire " + args[1]);
            }
        };    

        Thread threadOne = new Thread(runnable);
        Thread threadTwo = new Thread(runnable);
        
        threadOne.start();
        threadTwo.start();
        System.out.println("Solde final: " + account.GetBalance());
    }
}
