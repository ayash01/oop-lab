package Graphics;

public class Circle implements Shape {
    private double radius;
    private final double PI = 3.1415926;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return (this.PI * this.radius * this.radius);
    }

    public double Perimeter() {
        return (2 * this.PI * this.radius);
    }
}