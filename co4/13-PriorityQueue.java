import java.util.*;

class priorityQueueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> pQueue= new PriorityQueue<>();

        do {
            System.out.println();
            System.out.print("Select an option:\n1. Enqueue\n2. Dequeue\n3. Display\n\n0. Exit\n\n-> ");
            int choice = input.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("Enter element to enqueue: ");
                    pQueue.add(input.nextInt());
                }
                case 2 -> {
                    pQueue.remove();
                    System.out.print("First element dequeued");
                }
                case 3 -> {
                    for (Integer i : pQueue) System.out.print(i + " ");
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (true);
    }
}