import java.util.Arrays;
import java.util.Scanner;

class arrays {
    static int max;
    static int[] array = new int[max];

    public static void inputArray(int max, Scanner input) {

        for (int i = 0; i < max; i++) {
            array[i] = input.nextInt();
        }
    }

    public static void display() {
        for (int i = 0; i < max; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

class searchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int max = input.nextInt();

        System.out.println("Enter array elements: ");
        arrays.inputArray(max, input);

        System.out.println("The entered array is: " + arrays.display());

    }
}