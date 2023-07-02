import java.util.Scanner;
import java.lang.Math;

class fivesTable extends Thread {
    int number;

    fivesTable(int number){
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d x %d = %d\n", i, 5, i*5);
            try {
                Thread.sleep(2);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }
    }
}

class firstNprimes extends Thread {
    int number ;

    firstNprimes(int number){
        this.number = number;
    }

    public void run() {
        int count = 0 , num = 2;

        while (count < this.number) {
            boolean isPrime = true;

            for (int i = 2; i < (int)(Math.sqrt(num) + 1); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d\n",num);
                count += 1;
            }
            num += 1;
            try {
                Thread.sleep(2);
            }
            catch (InterruptedException exception) {
                System.out.println("Interrupted exception!");
            }
        }
    }
}

class threadsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of multiplication table entries: ");
        fivesTable table = new fivesTable(input.nextInt());

        System.out.print("Enter number of prime numbers to display: ");
        firstNprimes primes = new firstNprimes(input.nextInt());

        table.start();
        primes.start();

        input.close();
    }
}