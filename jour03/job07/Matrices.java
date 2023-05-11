public class Matrices {
    public static void main (String[] args){
        //Initialize each matrices
        final int matricesLength = 3;
        int[][] matrice1 = { {1,2,3} , {4,5,6} , {7,8,9} };
        int[][] matrice2 = { {10,20,30} , {40,50,60} , {70,80,90} };

        //Print 'matrice1'
        for (int i = 0; i < matricesLength; i++){
            for (int j = 0; j < matricesLength; j++){
                System.out.println("Value at column (" + j + ") and row (" + i + "): " + matrice1[i][j]);
            }
        }

        //Initialize and calculate total of each values between both matrices then print it
        int total = 0;
        for (int i = 0; i < matricesLength; i++){
            for (int j = 0; j < matricesLength; j++){
                total += (matrice1[i][j] + matrice2[i][j]);
            }
        }
        System.out.println("Total of both matrices: " + total);
    }
}