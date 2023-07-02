import java.util.*;

class DequeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deque<Integer> deque= new ArrayDeque<>();

        do {
            System.out.println();
            System.out.print("Select an option:\n1. Enqueue (front)\n2. Enqueue (rear)\n3. Dequeue (front)\n4. Dequeue (rear)\n5. Display\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter element to enqueue at the front: ");
                    deque.addFirst(input.nextInt());
                }
                case 2 -> {
                    System.out.println("Enter element to enqueue at the rear: ");
                    deque.addLast(input.nextInt());
                }
                case 3 -> {
                    deque.removeFirst();
                    System.out.print("Front element dequeued");
                }
                case 4 -> {
                    deque.removeLast();
                    System.out.print("Rear element dequeued");
                }
                case 5 -> {
                    for (Integer i : deque) System.out.print(i + " ");
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (true);
    }
}