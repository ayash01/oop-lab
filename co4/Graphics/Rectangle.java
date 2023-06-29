package Graphics;

public class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double Area() {
        return (this.length * this.width);
    }

    public double Perimeter() {
        return (2 * (this.length + this.width));
    }
}