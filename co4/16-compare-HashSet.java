import java.util.Scanner;
import java.util.HashSet;

class CompareHashSet {
    public static HashSet<Integer> inputHashSet(Scanner input) {
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter element count: ");
        int count = input.nextInt();
        System.out.printf("Enter %d elements: ", count);

        for (int i = 0; i < count; i++) {
            int n = input.nextInt();
            set.add(n);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<Integer> set1 = inputHashSet(input);
        HashSet<Integer> set2 = inputHashSet(input);

        input.close();

        System.out.println("Hashset 1: " + set1);
        System.out.println("Hashset 2: " + set2);

        if (set1.equals(set2)) {
            System.out.println("The hashsets are equal");
        } else {
            System.out.println("The hashsets are not equal");
        }
    }
}