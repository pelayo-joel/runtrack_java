package job07;

public class Circle {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }



    public double Area() {
        return this.radius * 2 * Math.PI;
    }
}
