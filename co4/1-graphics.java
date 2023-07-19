import Graphics.*;

import java.util.Scanner;

class graphicsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n");
            System.out.print("Select a shape:\n1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();
            System.out.println();
            switch(choice) {
                case 0 -> {
                    System.out.print("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.print("Enter square side length: ");
                    double side = input.nextDouble();

                    Square square = new Square(side);
                    System.out.printf("Square area: %2f\nSquare perimeter: %2f", square.Area(), square.Perimeter());
                }
                case 2 -> {
                    System.out.print("Enter rectangle length and width: ");
                    double length = input.nextDouble();
                    double width = input.nextDouble();

                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.printf("Rectangle area: %2f\nRectangle perimeter: %2f", rectangle.Area(), rectangle.Perimeter());
                }
                case 3 -> {
                    System.out.print("Enter circle radius: ");
                    double radius = input.nextDouble();

                    Circle circle = new Circle(radius);
                    System.out.printf("Circle area: %2f\nCircle perimeter: %2f", circle.Area(), circle.Perimeter());
                }
                case 4 -> {
                    double[] triangleParam = new double[5];

                    System.out.print("Enter triangle base, height, side 1, side 2, and side 3: ");
                    for (int i = 0; i < 5; i++) {
                        triangleParam[i] = input.nextDouble();
                    }

                    Triangle triangle = new Triangle(triangleParam[0], triangleParam[1], triangleParam[2], triangleParam[3], triangleParam[4]);
                    System.out.printf("Triangle area: %2f\nTriangle perimeter: %2f", triangle.Area(), triangle.Perimeter());
                }
                default -> System.out.print("Invalid input");
            }
        }
    }
}

