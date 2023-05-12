import java.util.Random;

public class Threading extends Thread {  
    private int count;

    public void run(long length) {
        for (int i = 0; i < length; i++){
            continue;
        }
    }

    public int getCount() { return count; }
}