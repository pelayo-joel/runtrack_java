public class Threading extends Thread {  
    private long sum;
    private double timeExec;
    public int threadID;

    public void run(long start, long end, int id) {
        threadID = id;
        double threadStart = System.nanoTime();
        for (long i = start; i < end; i++){
            sum += i;
        }
        double threadEnd = System.nanoTime();
        timeExec = threadEnd - threadStart;
    }

    public long getSum() { return sum; }
    public double getTimeExec() { return timeExec; }
}