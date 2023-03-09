import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows in matrices:");
        int row = Integer.parseInt(input.nextLine());
        System.out.println("Enter number of columns in matrices:");
        int col = Integer.parseInt(input.nextLine());

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];

        System.out.println("\nEnter elements of first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        System.out.println("\nEnter elements of second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        System.out.println("\nMatrix 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("\nMatrix 2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println("");
        }

        for (int i =0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nSum of Matrices:");
        for (int i =0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}