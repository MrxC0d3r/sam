# HappyNumber Class in Java

This Java program checks whether a given number is a happy number or an unhappy number. A happy number is a number which eventually reaches 1 when replaced by the sum of the square of its digits repeatedly. An unhappy number results in an endless cycle of numbers containing 4.

## Examples

- **Example 1**: 32
    - Process: 3^2 + 2^2 = 9 + 4 = 13; 1^2 + 3^2 = 1 + 9 = 10; 1^2 + 0^2 = 1
    - Therefore, 32 is a happy number.

- **Example 2**: 4
    - Process: 4^2 = 16; 1^2 + 6^2 = 1 + 36 = 37; 3^2 + 7^2 = 9 + 49 = 58; 5^2 + 8^2 = 25 + 64 = 89; 8^2 + 9^2 = 64 + 81 = 145; 1^2 + 4^2 + 5^2 = 1 + 16 + 25 = 42; 4^2 + 2^2 = 16 + 4 = 20; 2^2 + 0^2 = 4
    - Therefore, 4 is an unhappy number.

## Class Structure

The `HappyNumber` class contains the following components:

1. **Methods**:
    - `boolean isHappy(int number)`: This method checks if the given number is a happy number. It uses a `HashSet` to detect cycles and repeatedly calculates the sum of the squares of the digits until the number becomes 1 (happy) or 4 (unhappy).
    - `int getSumOfSquares(int number)`: This helper method calculates the sum of the squares of the digits of the given number.

2. **Main Method**:
    - The `main` method prompts the user to input a number and calls the `isHappy` method to check if it is a happy number. It then prints the result.

## Code Explanation

```java
import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

    // Method to check if a number is a happy number
    public static boolean isHappy(int number) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        while (number != 1 && number != 4) {
            if (!seenNumbers.add(number)) {
                break;
            }
            number = getSumOfSquares(number);
        }

        return number == 1;
    }

    // Helper method to get the sum of squares of digits of a number
    private static int getSumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Main method to input a number and check if it is a happy number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a happy number: ");
        int number = scanner.nextInt();

        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is an unhappy number.");
        }

        scanner.close();
    }
}
