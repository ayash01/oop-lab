import java.util.*;

class stackRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println();
            System.out.print("Select an option:\n1. Push element\n2. Display\n3. Remove element from position\n0. Exit\n-> ");
            int choice = input.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter element to add to the stack: ");
                    stack.push(input.nextInt());
                }
                case 2 -> {
                    for (Integer i : stack) System.out.print(i + " ");
                }
                case 3 -> {
                    if (!stack.empty()) {
                        System.out.println("Enter index of element to remove: ");
                        stack.remove(input.nextInt());
                        System.out.println("Element removed");
                    } else System.out.print("Stack empty");
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
