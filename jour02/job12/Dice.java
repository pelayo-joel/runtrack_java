public class Dice {
    public static void main(String[] args){
        int nCombinations = 0;

        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
                for (int k = 1; k <= 6; k++){
                    nCombinations++;
                    System.out.println("Combination " + nCombinations + ": " + i + " " + j + " " + k);
                }
            }
        }

        System.out.println("There's " + nCombinations + " possible combinations");
    }
}