import java.util.Scanner;
import java.util.Arrays;

class sort_string {
    public static String sort(String string) {
        char[] array = string.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input_str = input.nextLine();
        System.out.println("The sorted string is " + sort(input_str));
    }
}//hello
