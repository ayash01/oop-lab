import java.util.Scanner;
import java.util.Arrays;

class sortStrings{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = input.nextInt();

        String[] array = new String[n];
        System.out.printf("\nEnter %d strings:\n",n);

        for(int i = 0; i < n ; i++){
            array[i] = input.next();
        }

        System.out.println("\nEntered array: ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + "\t");
        }

        Arrays.sort(array);

        System.out.println("\nSorted array: ");
        for(int i = 0; i < n ; i++){
            System.out.print(array[i] + "\t");
        }

        input.close();
    }
}
