import java.util.Scanner;

class SymmetricMatrix {
    private final int[][] matrix;

    public SymmetricMatrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public void setElement(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public static SymmetricMatrix defineMatrix(int rows, int cols) {
        Scanner input = new Scanner(System.in);
        SymmetricMatrix matrix = new SymmetricMatrix(rows, cols);

        System.out.print("\nEnter elements of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix.setElement(i, j, input.nextInt());
            }
        }
        return matrix;
    }

    public static boolean isSymmetric(SymmetricMatrix matrix) {
        int rows = matrix.matrix.length;
        int cols = matrix.matrix[0].length;

        if (rows != cols) {
            System.out.println("Not a square matrix, cannot check symmetry.");
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix.matrix[i][j] != matrix.matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

class CheckSymmetric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        SymmetricMatrix matrix = SymmetricMatrix.defineMatrix(rows, cols);

        if (SymmetricMatrix.isSymmetric(matrix)) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }
    }
}