import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int diagSum = 0;

        // Get user input for the matrix
        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Calculate row and column sums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        // Calculate diagonal sum
        for (int i = 0; i < 3; i++) {
            diagSum += matrix[i][i];
        }

        // Display results
        System.out.println("Row sums:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i+1) + ": " + rowSum[i]);
        }
        System.out.println("Column sums:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Column " + (i+1) + ": " + colSum[i]);
        }
        System.out.println("Diagonal sum: " + diagSum);
    }
}
