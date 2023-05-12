import java.util.Random;
import java.util.ArrayList;

public class Threading extends Thread {  
    private int segmentSum = 0;

    public void run(int[] segmentNum) {
        for (int num : segmentNum){
            segmentSum += num;
        }
    }

    public int getSum() { return segmentSum; }
}