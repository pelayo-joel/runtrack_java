package src.jour1.job7;


public class FormesTest {
    public static void main(String[] args) {
        Circle cercle = new Circle(2.0);
        Square carre = new Square(3.0);

        System.out.println("Aire du cercle de rayon 2:" + cercle.Area());
        System.out.println("Aire du cercle de rayon 3:" + carre.Area());
    }
}
