package Graphics;

public class Triangle implements Shape {
    private double base, height, side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double Area() {
        return (0.5 * this.base * this.height);
    }

    public double Perimeter() {
        return (this.side1 + this.side2 + this.side3);
    }
}