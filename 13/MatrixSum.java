import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] m = new int[4][4];
        int[][] n = new int[4][4];
        int[][] p = new int[4][4];

        // Input elements for array m
        System.out.println("Enter elements for the 4x4 matrix m:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = scanner.nextInt();
            }
        }

        // Input elements for array n
        System.out.println("Enter elements for the 4x4 matrix n:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("n[" + i + "][" + j + "]: ");
                n[i][j] = scanner.nextInt();
            }
        }

        // Calculate sum of corresponding elements of m and n, store in p
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                p[i][j] = m[i][j] + n[i][j];
            }
        }

        // Display elements of array p
        System.out.println("Sum of corresponding elements of matrices m and n (matrix p):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
