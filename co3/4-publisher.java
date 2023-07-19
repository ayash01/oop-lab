import java.util.Scanner;

class Publisher {
    String pubname;

    Publisher(String pubname) {
        this.pubname = pubname;
    }
}

class Book extends Publisher {
    String author;
    int price;

    Book(String pubname, String author, int price) {
        super(pubname);
        this.author = author;
        this.price = price;
    }
}

class Literature extends Book {
    String litname;

    Literature(String pubname, String author, int price, String litname) {
        super(pubname, author, price);
        this.litname = litname;
    }

    void display() {
        System.out.println("\nPublisher: " + pubname + "\nAuthor: " + author + "\nPrice: " + price + "\nBook: " + litname + "\n");
    }
}

class Fiction extends Book {
    String fictname;

    Fiction(String pubname, String author, int price, String fictname) {
        super(pubname, author, price);
        this.fictname = fictname;
    }

    void display() {
        System.out.println("\nPublisher: " + pubname + "\nAuthor: " + author + "\nPrice: " + price + "\nBook: " + fictname + "\n");
    }
}

class bookInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ch, price;
        String title, author, publisher;

        while (true) {
            System.out.println("\nBook Info:\n--------------");
            System.out.print("Select a genre:\n\n1. Literature\n2. Fiction\n\n0. Exit program\n\n-> ");
            ch = input.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter Literature Book publisher, title, author, and price: ");
                    publisher = input.next();
                    title = input.next();
                    author = input.next();
                    price = input.nextInt();
                    Literature lit = new Literature(publisher, author, price, title);
                    lit.display();
                }
                case 2 -> {
                    System.out.print("Enter Fiction Book publisher, title, author, and price: ");
                    publisher = input.next();
                    title = input.next();
                    author = input.next();
                    price = input.nextInt();
                    Fiction fict = new Fiction(publisher, author, price, title);
                    fict.display();
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
    }
}

