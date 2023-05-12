import java.util.Random;

public class StringThreads extends Thread {
    private String segment;
    
    
    public void run(long length) {
        for (int i = 0; i < length; i++){
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            segment += c;
        }
    }

    public String getSegment() {
        return segment;
    }
}