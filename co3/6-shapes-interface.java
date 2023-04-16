import java.util.Scanner;
import java.lang.Math;

interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double perimeter() {
        return (2 * Math.PI * this.radius);
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return (this.length * this.breadth);
    }

    public double perimeter() {
        return (2 * (this.length + this.breadth));
    }
}

class shapesCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch;

        do {
            System.out.print("\nPlease select a shape to display its area and perimeter:\n1. Circle\n2. Rectangle\n\n0. Exit\n\n-> ");
            ch = input.nextInt();
            switch (ch) {
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.print("Enter radius of circle: ");
                    Circle circ1 = new Circle(input.nextDouble());
                    System.out.println("Circle\nArea: " + circ1.area() + "\nPerimeter: " + circ1.perimeter());
                }
                case 2 -> {
                    System.out.print("Enter length and breadth of rectangle: ");
                    Rectangle rect1 = new Rectangle(input.nextDouble(), input.nextDouble());
                    System.out.print("Rectangle\nArea: " + rect1.area() + "\nPerimeter: " + rect1.perimeter());
                }
                default -> System.out.print("Invalid selection");
            }
        } while (true);
    }
}
