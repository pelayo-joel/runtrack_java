public class BasicArray {
    public static void main (String[] args){
        //Initialize an empty array of fixed length 5;
        int[] tableau = new int[5];

        //Initialize values at requested indexes
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        //Print initialzed values
        System.out.println("Index 0: " + tableau[0] + ", Index 2: " + tableau[2] + ", Index 4: " + tableau[4]);
    }
}