package src.jour3.job4;

public class Boite<T> {
    private T data;

    public Boite(T newData) {
        this.data = newData;
    }



    public void PrintData() {
        System.out.println("Contenu de la boite: " + this.data);
    }
}
