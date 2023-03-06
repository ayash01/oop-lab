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

class main {
    public static void main(String args[]) {

        String pname[] = new String[3];
        int pcode[] = new int[3];
        int price[] = new int[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name, product code, and price of product 1: ");
        pname[0] = input.nextLine();
        pcode[0] = Integer.parseInt(input.nextLine());
        price[0] = Integer.parseInt(input.nextLine());

        System.out.println("\nEnter name, product code, and price of product 2: ");
        pname[1] = input.nextLine();
        pcode[1] = Integer.parseInt(input.nextLine());
        price[1] = Integer.parseInt(input.nextLine());

        System.out.println("\nEnter name, product code, and price of product 3: ");
        pname[2] = input.nextLine();
        pcode[2] = Integer.parseInt(input.nextLine());
        price[2] = Integer.parseInt(input.nextLine());

        if (price[0] < price[1]  &&  price[0] < price[2]) {
            System.out.println("Product 1 has the lowest price (" + price[0] + ")");
        }
        else if (price[1] < price[0] && price[1] < price[2]) {
            System.out.println("Product 2 has the lowest price (" + price[1] + ")");
        }
        else if (price[2] < price[0] && price[2] < price[0]) {
            System.out.println("Product 3 has the lowest price (" + price[2] + ")");
        }
        else if (price[0] == price[1] && price[0] < price[2]) {
            System.out.println("Product 1 & 2 have the lowest price");
        }
        else if (price[1] == price[2] && price[1] < price[0]) {
            System.out.println("Product 2 & 3 have the lowest price");
        }
        else if (price[0] == price[2] && price[0] < price[1]) {
            System.out.println("Product 1 & 3 have the lowest price");
        }
        else {
            System.out.println("All products have the same price");
        }
    }
}
