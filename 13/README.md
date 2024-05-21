# MatrixSum Class in Java

This Java program stores numbers in two different 2D arrays, finds the sum of the corresponding elements of the two arrays, stores the results in a third array, and displays the elements of the resulting array in matrix form.

## Example

### Arrays

- **Array m**:
    ```
    12 23 33 22
    20 31 44 10
    10 25 14 8
    41 52 24 12
    ```

- **Array n**:
    ```
    8 22 31 15
    11 16 30 26
    10 17 25 33
    12 24 21 32
    ```

- **Array p** (sum of corresponding elements of m and n):
    ```
    20 45 64 37
    31 47 74 36
    20 42 39 41
    53 76 45 44
    ```

## Class Structure

The `MatrixSum` class contains the following components:

1. **Main Method**:
    - The `main` method inputs elements for two 4x4 matrices (`m` and `n`), calculates the sum of the corresponding elements, stores the results in a third 4x4 matrix (`p`), and displays the elements of the resulting matrix in matrix form.

## Code Explanation

```java
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
