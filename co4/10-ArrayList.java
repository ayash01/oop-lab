import java.util.*;

class arrayList {
    private static void printSorted(ArrayList<String> list) {
        ArrayList<String> sortedList = new ArrayList<>(list);
        sortedList.sort(Comparator.naturalOrder());
        for (String s : sortedList) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.print("Select an option:\n1. Add String to list\n2. Remove String from list\n3. Clear List\n4. Sort list\n5. Display List\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter string to add to the list: ");
                    list.add(input.next());
                }
                case 2 -> {
                    if (!list.isEmpty()) {
                        System.out.println("Enter index of element to remove: ");
                        list.remove(input.nextInt());
                    } else {
                        System.out.print("Empty list");
                    }
                }
                case 3 -> {
                    if (!list.isEmpty()) {
                        list.clear();
                        System.out.println("List cleared");
                    } else {
                        System.out.print("Empty list");
                    }
                }
                case 4 -> {
                    if (!list.isEmpty()) {
                        System.out.println("List elements in sorted order: ");
                        printSorted(list);
                    } else {
                        System.out.print("Empty list");
                    }
                }
                case 5 -> {
                    if (!list.isEmpty()) {
                        System.out.println("Current list: ");
                        for (String s : list) System.out.print(s + " ");
                    } else {
                        System.out.print("Empty list");
                    }
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}