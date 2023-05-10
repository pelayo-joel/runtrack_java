public class EvenSum {
    public static void main(String[] args){
        int evenSum = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) { evenSum += i; }
        }

        System.out.println("La somme des nombres pairs entre 1 et 100 est : " + evenSum);
    }
}