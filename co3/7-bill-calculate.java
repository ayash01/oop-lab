import java.util.Scanner;
import java.util.Date;
import java.lang.Math;

interface Bill {
    void calculate();
}

class Order implements Bill {
    Date date;
    String[] name;
    int num, order_no, net_amount;
    int[] product_id, quantity, unit_price, total;

    Order(int num, String[] name, int[] product_id, int[] quantity, int[] unit_price) {
        this.order_no = (int) (Math.random() * 1000);
        this.date = new Date();
        this.num = num;
        this.net_amount = 0;

        this.name = new String[num];
        this.product_id = new int[num];
        this.quantity = new int[num];
        this.unit_price = new int[num];
        this.total = new int[num];

        for (int i = 0; i < this.num; i++) {
            this.name[i] = name[i];
            this.product_id[i] = product_id[i];
            this.quantity[i] = quantity[i];
            this.unit_price[i] = unit_price[i];
            this.total[i] = unit_price[i] * quantity[i];
            this.net_amount += this.total[i];
        }
    }

    public void calculate() {
        System.out.println("Order No. " + this.order_no);
        System.out.println("Date: " + this.date);
        System.out.println("Product Id\tName\t\tQuantity\tUnit Price\tTotal Price\n");
        System.out.println("--------------------------------------------------------------------------\n");
        for (int i = 0; i < this.num; i++) {
            System.out.printf("%d\t\t%s\t\t%d\t\t\t\t%d\t\t%d\n", this.product_id[i], this.name[i], this.quantity[i], this.unit_price[i], this.total[i]);
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\tNet Amount: " + this.net_amount + "\n");
    }
}

class billCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = input.nextInt();

        String[] name = new String[n];
        int[] product_id = new int[n];
        int[] quantity = new int[n];
        int[] unit_price = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, product ID, quantity and unit price of product " + (i + 1));
            name[i] = input.next();
            product_id[i] = input.nextInt();
            quantity[i] = input.nextInt();
            unit_price[i] = input.nextInt();
        }
        Order order1 = new Order(n, name, product_id, quantity, unit_price);
        order1.calculate();

        input.close();
    }
}