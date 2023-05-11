

/*-------------------- Tried to not use any 'Collections' library from java and work only with standard arrays --------------------*/


public class SortedMatrice {
    public static void main (String[] args){
        //Initialize the matrice
        final int matriceLength = 3;
        int[][] matrice = { {5,9,3}, {7,2,8}, {1,6,4} };

        //Print the default matrice
        System.out.println("Default unsorted matrice: ");
        Print(matrice, matriceLength);

        //Sort then print the sorted matrice
        matrice = MatriceSort(matrice, matriceLength);
        System.out.println("Sorted matrice: ");
        Print(matrice, matriceLength);
    }




    
    //Utility function to print matrices
    public static void Print (int[][] matrice, int length){
        for (int i = 0; i < length; i++){
            System.out.print("Row (" + i + "): ");
            for (int j = 0; j < length; j++){
                System.out.print(matrice[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //Search if a certain value is in the matrix using linear search
    public static boolean Search (int[][] matrice, int valueToSearch, int length){
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (matrice[i][j] == valueToSearch) { return true; }
            }
        }
        return false;
    }

    //Search the highest value in the matrice, still using linear search
    public static int Highest(int[][] unsortedMatrice, int length) {
        int max = 0;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (max < unsortedMatrice[i][j]) { max = unsortedMatrice[i][j]; }
            }
        }
        return max;
    }

    //Same thing but for the smallest value, actually depends on highest value tho
    public static int Smallest (int[][] unsortedMatrice, int[][] sortedMatrice, int length, int highestValue){
        int small = highestValue;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                if (unsortedMatrice[i][j] < small && (!Search(sortedMatrice, unsortedMatrice[i][j], length))) { small = unsortedMatrice[i][j]; }
            }
        }
        return small;
    }

    /* Actual function that sorts the matrice using above functions, it uses Quicksort and makes it a general big'O notation of O(n^?)
        (which is the least optimal option especially since we're using linear search during the algorithm multiple times) */
    public static int[][] MatriceSort (int[][] unsorted, int length){
        int[][] sorted = { new int[length], new int[length], new int[length] };
        int max = Highest(unsorted, length);

        for (int i = 0; i < length; i++){
            for (int j = 0; j < length; j++){
                sorted[i][j] = Smallest(unsorted, sorted, length, max);
            }
        }

        return sorted;
    }
}