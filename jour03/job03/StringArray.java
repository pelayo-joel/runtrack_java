public class StringArray {
    public static void main (String[] args) {
        //Define a constant that'll be the length of 'names'
        String[] names = {"Josette", "John", "Myrtille", "Marc"};


        //Print requested values and modify the value at index 2 as requested
        System.out.println("Value at index 1: " + names[1] + ", Value at index 2: " + names[2]);

        names[2] = "Mireille";
        System.out.println("New value at index 2: " + names[2]);
    }
}