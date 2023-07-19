import Arithmetic.*;
import java.util.Scanner;

class arithmeticDemo {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        while (true) {
            System.out.println("\n");
            System.out.print("Select an arithmetic operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();
            if (choice == 0) {
                System.out.print("Exiting program...");
                input.close();
                System.exit(0);
            }
            else if (choice >=1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                num1 = input.nextDouble();
                num2 = input.nextDouble();
            }
            switch(choice) {
                case 1 -> {
                    Arithmetic addition = new Addition();
                    System.out.print("Sum: " + addition.operate(num1, num2));
                }
                case 2 -> {
                    Arithmetic subtraction = new Subtraction();
                    System.out.print("Difference: " + subtraction.operate(num1, num2));
                }
                case 3 -> {
                    Arithmetic multiplication = new Multiplication();
                    System.out.print("Product: " + multiplication.operate(num1, num2));
                }
                case 4 -> {
                    Arithmetic division = new Division();
                    System.out.print("Quotient: " + division.operate(num1, num2));
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
}
