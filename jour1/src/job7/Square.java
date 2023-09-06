package job07;

public class Square {
    private double sideLength;

    public Square(double length) {
        this.sideLength = length;
    }



    public double Area() {
        return this.sideLength * this.sideLength;
    }
}
