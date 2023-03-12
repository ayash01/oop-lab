import java.util.Scanner;

class Matrix {
    private final int[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public void setElement(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public int getElement(int row, int col) {
        return matrix[row][col];
    }

    public void printMatrix() {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static Matrix defineMatrix(int rows, int cols) {
        Scanner input = new Scanner(System.in);
        Matrix matrix = new Matrix(rows, cols);

        System.out.println("\nEnter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix.setElement(i, j, input.nextInt());
            }
        }

        return matrix;
    }
}

class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows in matrices:");
        int row = Integer.parseInt(input.nextLine());
        System.out.println("Enter number of columns in matrices:");
        int col = Integer.parseInt(input.nextLine());

        Matrix a = Matrix.defineMatrix(row, col);
        Matrix b = Matrix.defineMatrix(row, col);

        System.out.println("\nMatrix 1:");
        a.printMatrix();

        System.out.println("\nMatrix 2:");
        b.printMatrix();

        Matrix c = new Matrix(row, col);

        for (int i =0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c.setElement(i, j, a.getElement(i, j) + b.getElement(i, j));
            }
        }

        System.out.println("\nSum of Matrices:");
        c.printMatrix();
    }
}