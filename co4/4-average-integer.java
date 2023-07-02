import java.util.Scanner;

class negativeNumberException extends Exception {
    negativeNumberException(String message) {
        super(message);
    }
}

class averageInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, count, sum = 0;
        double average;

        System.out.print("Enter number of integers to input: ");
        count = input.nextInt();

        for (int i = 0; i < count; i++) {
            try {
                System.out.printf("Enter integer %d: ", i+1);
                number = input.nextInt();

                if (number < 0) {
                    throw new negativeNumberException("Negative numbers are not allowed");
                }
                sum += number;
            }
            catch(negativeNumberException exception) {
                System.out.println(exception.getMessage());
                i--;
            }
        }
        average = (double) sum/count ;
        System.out.println("average: " + average);

        input.close();
    }
}
