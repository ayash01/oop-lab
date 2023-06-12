import java.util.*;

class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> linkedlist= new LinkedList<Integer>();

        do {
            System.out.println();
            System.out.print("Select an option:\n1. Insert Element\n2. Display\n3. Remove all elements\n0. Exit\n-> ");
            int choice = input.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter element to insert: ");
                    linkedlist.add(input.nextInt());
                }
                case 2 -> {
                    if (!linkedlist.isEmpty()) {
                        for (Integer i : linkedlist) System.out.print(i + " ");
                    } else System.out.print("List empty");
                }
                case 3 -> {
                    if (!linkedlist.isEmpty()) {
                        linkedlist.clear();
                        System.out.println("All elements removed");
                    } else System.out.print("List empty");
                }
                default -> System.out.println("Invalid option");
            }
        } while(true);
    }
}