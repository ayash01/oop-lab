import java.util.Scanner;

class Shapes {
    int area(int length, int breadth) {
        return length * breadth;
    }

    int area(int side) {
        return side * side;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

class AreaShapes {
    public static void main(String[] args) {
        int ch;
        Scanner input = new Scanner(System.in);
        Shapes shape = new Shapes();

        do {
            System.out.println("\nArea Calculator\n----------------");
            System.out.print("Select a shape:\n\n1. Rectangle\n2. Square\n3. Triangle\n4. Circle\n\n0. Exit program\n\n-> ");
            ch = input.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter rectangle length and breadth: ");
                    int len = input.nextInt();
                    int br = input.nextInt();
                    int area = shape.area(len, br);
                    System.out.println("\nRectangle area: " + shape.area(len, br));
                }
                case 2 -> {
                    System.out.print("Enter square side length: ");
                    int side = input.nextInt();
                    System.out.println("\nSquare area: " + shape.area(side));

                }
                case 3 -> {
                    System.out.print("Enter triangle length and breadth: ");
                    double base = input.nextDouble();
                    double high = input.nextDouble();
                    double area = shape.area(base, high);
                    System.out.println("\nTriangle area: " + shape.area(base, high));
                }
                case 4 -> {
                    System.out.print("Enter circle radius: ");
                    double rad = input.nextDouble();
                    System.out.println("\nCircle area: " + shape.area(rad));
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        } while (true);
    }
}