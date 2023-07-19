import java.util.*;

class LinkedHashSetDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();

        while (true) {
            System.out.print("");
            System.out.print("Select an option:\n1. Insert\n2. Delete\n3. Display\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.print("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.print("Enter element to insert: ");
                    set.add(input.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter index of element to remove: ");
                    set.remove(input.nextInt());
                }
                case 3 -> {
                    for (Integer i : set) System.out.print(i + " ");
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
