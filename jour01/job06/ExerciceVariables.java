public class ExerciceVariables {
    public static void main (String[] args){
        int num1 = 6; int num2 = 3;
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);

        //Swap using bitwise operators (exclusive or operators)
        num1 ^= num2; 
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
    }
}