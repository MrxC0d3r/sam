import java.util.Scanner;

public class MatrixSum {

    // Method to calculate the sum of all elements in the matrix
    public static int sumOfAllElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Method to calculate the sum of diagonal elements in the matrix
    public static int sumOfDiagonalElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i < matrix[i].length) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }

    // Main method to input matrix elements, calculate sums, and print results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][4];

        // Input elements of the 3x4 matrix
        System.out.println("Enter the elements of the 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate sums
        int totalSum = sumOfAllElements(matrix);
        int diagonalSum = sumOfDiagonalElements(matrix);

        // Print results
        System.out.println("Sum of all elements: " + totalSum);
        System.out.println("Sum of diagonal elements: " + diagonalSum);

        scanner.close();
    }
}
