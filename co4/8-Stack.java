import java.util.*;

class stackDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println();
            System.out.print("Select an option:\n1. Push\n2. Pop\n3. Display\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();

            switch(choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.print("Enter element to push: ");
                    stack.push(input.nextInt());
                }
                case 2 -> {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        System.out.println("Stack empty");
                    }
                }
                case 3 -> {
                    if (!stack.empty()) {
                        for (Integer index : stack) System.out.println(index);
                    } else {
                        System.out.println("Stack empty");
                    }
                }
            }
        }
    }
}