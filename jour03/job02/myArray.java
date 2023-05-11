public class myArray {
    public static void main (String[] args){
        //Initialize 'monTableau' with requested values and print it
        int[] monTableau = {12, 6, 76, 89};
        System.out.println("All values in 'monTableau': ");

        for (int i = 0; i < 4; i++){
            System.out.println(monTableau[i]);
        }
        System.out.println();


        //Modify and print each values
        System.out.println("New values in 'monTableau': ");
        for (int i = 0; i < 4; i++){
            monTableau[i] = (i+1);
            System.out.println(monTableau[i]);
        }
    }
}