# PatternMenu Class in Java

This Java program provides a menu-driven interface to print various patterns based on user selection.

## Patterns

1. **Pattern i**:
    ```
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    ```

2. **Pattern ii**:
    ```
    1 2 3 4 5 6 7
    1 2 3 4 5 6
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6
    1 2 3 4 5 6 7
    ```

3. **Pattern iii**:
    ```
    ABCDEFEDCBA
    ABCDE EDCBA
    ABCD   DCBA
    ABC     CBA
    AB       BA
    A         A
    AB       BA
    ABC     CBA
    ABCD   DCBA
    ABCDE EDCBA
    ABCDEFEDCBA
    ```

4. **Pattern iv**:
    ```
    J
    I H
    G F E
    D C B A
    ```

## Class Structure

The `PatternMenu` class contains the following components:

1. **Methods**:
    - `patternOne()`: Prints the first pattern.
    - `patternTwo()`: Prints the second pattern.
    - `patternThree()`: Prints the third pattern.
    - `patternFour()`: Prints the fourth pattern.

2. **Main Method**:
    - The `main` method provides a menu to the user to choose one of the patterns or exit the program.

## Code Explanation

```java
import java.util.Scanner;

public class PatternMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Pattern i");
            System.out.println("2. Pattern ii");
            System.out.println("3. Pattern iii");
            System.out.println("4. Pattern iv");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    patternOne();
                    break;
                case 2:
                    patternTwo();
                    break;
                case 3:
                    patternThree();
                    break;
                case 4:
                    patternFour();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void patternOne() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternTwo() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternThree() {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 0; j--) {
                if (j != n) {
                    System.out.print((char) (65 + j));
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print((char) (65 + j));
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 0; j--) {
                if (j != n) {
                    System.out
