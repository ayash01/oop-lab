import java.util.Arrays;
import java.util.Scanner;

class arrays {
    int max;
    int[] array;

    public arrays(int max) {
        this.max = max;
        this.array = new int[max];
    }

    public void inputArray(Scanner input) {
        for (int i = 0; i < max; i++)
            array[i] = input.nextInt();
    }

    public void searchArray(Scanner input) {
        System.out.print("\nEnter search key: ");
        int key = input.nextInt();

        Arrays.sort(array);
        System.out.println("\nSorted array: ");
        for (int i = 0; i < max; i++) {
            System.out.print(array[i] + " ");
        }

        int result = Arrays.binarySearch(array, key);
        if (result >= 0)
            System.out.println("\n\nKey Found at index " + result);
        else
            System.out.println("\nKey not found");
    }

    public void display() {
        for (int i = 0; i < max; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class searchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int max = input.nextInt();

        arrays array = new arrays(max);

        System.out.print("\nEnter array elements: ");
        array.inputArray(input);

        System.out.println("\nThe entered array is: ");
        array.display();

        array.searchArray(input);
    }
}