import java.util.Scanner;

class fibonacciSeries implements Runnable {
    int number;

    fibonacciSeries(int number) {
        this.number = number;
    }

    public void run() {
        int num1 = 0, num2 = 1, num3, count = 2;

        System.out.printf("%d\n%d\n", num1, num2);

        while (count < number) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            count++;
        }
    }
}

class evenNumbers implements Runnable {
    int start, end;

    evenNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        if (start % 2 != 0) {
            start++;
        }

        for(int i = start; i <= end; i+=2) {
            System.out.println(i + "\n");
        }
    }
}

class runnableDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int num = input.nextInt();

        System.out.print("Enter start number and end number: ");
        int start = input.nextInt();
        int end = input.nextInt();

        Runnable fibonacci = new fibonacciSeries(num);
        Runnable even = new evenNumbers(start, end);

        Thread thread1 = new Thread(fibonacci);
        Thread thread2 = new Thread(even);

        thread1.start();
        thread2.start();

        input.close();
    }
}