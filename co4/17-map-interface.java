import java.util.*;

class MapDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        while (true) {
            System.out.println("Select an option:\n1. Insert\n2. Update\n3. Delete\n4. Display\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.print("Enter element count: ");
                    int count = input.nextInt();

                    System.out.printf("enter %d key-value pairs: ", count);
                    for (int i = 0; i < count; i++) {
                        int key = input.nextInt();
                        String value = input.next();
                        map.put(key, value);
                    }
                }
                case 2 -> {
                    System.out.print("Enter key to update: ");
                    int key = input.nextInt();
                    System.out.print("Enter new value: ");
                    map.put(key, input.next());
                }
                case 3 -> {
                    System.out.print("Enter key to delete: ");
                    map.remove(input.nextInt());
                }
                case 4 -> System.out.println("Current map: " + map);
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}