import java.util.Scanner;

class Product {
    String pname;
    int pcode;
    int price;

    Product (String pname, int pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }
}

class q1 {
    public static void main(String[] args) {

        String[] pname = new String[3];
        int[] pcode = new int[3];
        int[] price = new int[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name, product code, and price of product " + (i+1) + ": ");
            pname[i] = input.nextLine();
            pcode[i] = Integer.parseInt(input.nextLine());
            price[i] = Integer.parseInt(input.nextLine());
        }

        Product p1 = new Product(pname[0], pcode[0], price[0]);
        Product p2 = new Product(pname[1], pcode[1], price[1]);
        Product p3 = new Product(pname[2], pcode[2], price[2]);

        if (p1.price < p2.price && p1.price < p3.price) {
                System.out.println(pname[0] + " has the lowest price (" + p1.price + ")");
        }
        else if (p2.price < p1.price && p2.price < p3.price) {
            System.out.println(pname[1] + " has the lowest price (" + p2.price + ")");
        }
        else if (p3.price < p1.price && p3.price < p2.price) {
            System.out.println(pname[2] + " has the lowest price (" + p3.price + ")");
        }
        else {
            System.out.println("All products have the same price");
        }
    }
}
