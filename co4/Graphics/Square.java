package Graphics;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double Area() {
        return (this.side * this.side);
    }

    public double Perimeter() {
        return (4 * this.side);
    }
}