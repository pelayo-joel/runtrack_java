

/*-------------------- Tried to not use any 'Collections' library from java and work only with standard arrays --------------------*/


public class SortedMatrice {
    public static void main (String[] args){
        //Initialize the matrice
        int[][] matrice = { {5,9,3}, {7,2,8}, {1,6,4} };

        //Print the default matrice
        System.out.println("Default unsorted matrice: ");
        Print(matrice);

        //Sort then print the sorted matrice
        matrice = MatriceSort(matrice);
        System.out.println("Sorted matrice: ");
        Print(matrice);
    }




    
    //Utility function to print matrices
    public static void Print (int[][] matrice){
        for (int i = 0; i < matrice.length; i++){
            System.out.print("Row (" + i + "): ");
            for (int j = 0; j < matrice.length; j++){
                System.out.print(matrice[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //Search if a certain value is in the matrix using linear search
    public static boolean Search (int[][] matrice, int valueToSearch){
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice.length; j++){
                if (matrice[i][j] == valueToSearch) { return true; }
            }
        }
        return false;
    }

    //Search the highest value in the matrice, still using linear search
    public static int Highest(int[][] unsortedMatrice) {
        int max = 0;
        for (int i = 0; i < unsortedMatrice.length; i++){
            for (int j = 0; j < unsortedMatrice.length; j++){
                if (max < unsortedMatrice[i][j]) { max = unsortedMatrice[i][j]; }
            }
        }
        return max;
    }

    //Same thing but for the smallest value, actually depends on highest value tho
    public static int Smallest (int[][] unsortedMatrice, int[][] sortedMatrice, int highestValue){
        int small = highestValue;
        for (int i = 0; i < unsortedMatrice.length; i++){
            for (int j = 0; j < unsortedMatrice.length; j++){
                if (unsortedMatrice[i][j] < small && (!Search(sortedMatrice, unsortedMatrice[i][j]))) { small = unsortedMatrice[i][j]; }
            }
        }
        return small;
    }

    /* Actual function that sorts the matrice using above functions, it uses Quicksort and makes it a general big'O notation of O(n^?)
        (which is the least optimal option especially since we're using linear search during the algorithm multiple times) */
    public static int[][] MatriceSort (int[][] unsorted){
        int[][] sorted = new int[unsorted.length][unsorted.length];
        int max = Highest(unsorted);

        for (int i = 0; i < unsorted.length; i++){
            for (int j = 0; j < unsorted.length; j++){
                sorted[i][j] = Smallest(unsorted, sorted, max);
            }
        }

        return sorted;
    }
}