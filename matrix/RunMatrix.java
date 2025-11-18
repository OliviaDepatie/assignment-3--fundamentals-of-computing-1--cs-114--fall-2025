import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of your matrix: ");
        int size = scan.nextInt();
        scan.close();

        Matrix matrix = new Matrix(size);
        matrix.printMatrixDefault();
        matrix.populateMatrix();
        matrix.printMatrix("Printing matrix:");
        matrix.flipMatrix();
        matrix.printMatrix("Printing flipped matrix:");
    }
}
