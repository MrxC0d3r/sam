# DisariumNumber Class in Java

This Java program checks whether a given number is a Disarium number or not. A number is said to be a Disarium number when the sum of its digits raised to the power of their respective positions is equal to the number itself.

## Examples

- **Example 1**: 175
    - 1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175
    - Therefore, 175 is a Disarium number.

- **Example 2**: 89
    - 8^1 + 9^2 = 8 + 81 = 89
    - Therefore, 89 is a Disarium number.

## Class Structure

The `DisariumNumber` class contains the following components:

1. **Methods**:
    - `boolean isDisarium(int number)`: This method checks if the given number is a Disarium number. It calculates the sum of the digits raised to the power of their respective positions and compares it with the original number.

2. **Main Method**:
    - The `main` method prompts the user to input a number and calls the `isDisarium` method to check if it is a Disarium number. It then prints the result.

## Code Explanation

```java
import java.util.Scanner;

public class DisariumNumber {

    // Method to check if a number is a Disarium number
    public static boolean isDisarium(int number) {
        int sum = 0, num = number, length = String.valueOf(number).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, length);
            num /= 10;
            length--;
        }

        return sum == number;
    }

    // Main method to input a number and check if it is a Disarium number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a Disarium number: ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }

        scanner.close();
    }
}
