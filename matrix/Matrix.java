public class Matrix {
    private int[][] matrix;

    public Matrix(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("Matrix size must be positive.");
        matrix = new int[size][size];
        System.out.println("Your matrix is " + size + " x " + size);
    }

    public void printMatrixDefault() {
        final String YELLOW = "\u001B[33m";
        final String RESET = "\u001B[0m";
        System.out.println("\nPrinting matrix with default values:\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1)
                    System.out.printf(YELLOW + "%4d" + RESET, 0);
                else
                    System.out.printf("%4d", 0);
            }
            System.out.println();
        }
    }

    public void populateMatrix() {
        int count = 1;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                matrix[i][j] = count++;
        System.out.println("\nPopulating matrix...matrix populated:\n");
    }

    public void printMatrix(String message) {
        final String YELLOW = "\u001B[33m";
        final String RESET = "\u001B[0m";
        System.out.println(message + "\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1)
                    System.out.printf(YELLOW + "%4d" + RESET, matrix[i][j]);
                else
                    System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private void swap(int row1, int column1, int row2, int column2) {
        int temp = matrix[row1][column1];
        matrix[row1][column1] = matrix[row2][column2];
        matrix[row2][column2] = temp;
    }

    public void flipMatrix() {
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row + column < n - 1) {
                    swap(row, column, n - 1 - row, n - 1 - column);
                }
            }
        }
        System.out.println("\nFlipping matrix...matrix flipped\n");
    }
}
