# NumberCheck Class in Java

This Java program provides a menu-driven interface to check whether a given number is a Harshad number or a perfect number. The program continues to prompt the user for input until they choose to exit.

## Class Structure

The `NumberCheck` class contains the following components:

1. **Methods**:
    - `isHarshad(int number)`: This method checks if a number is a Harshad number. A number is considered a Harshad number if it is divisible by the sum of its digits.
    - `isPerfect(int number)`: This method checks if a number is a perfect number. A number is considered a perfect number if the sum of its positive divisors (excluding the number itself) is equal to the number.

2. **Main Method**:
    - The `main` method provides a menu-driven interface for the user to check if a number is a Harshad number or a perfect number. It uses a `Scanner` to read input from the user.

## Code Explanation

```java
import java.util.Scanner;

class NumberCheck {
    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int number) {
        int sumOfDigits = 0;
        int temp = number;
        
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        
        return (number % sumOfDigits == 0);
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sumOfDivisors = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        
        return (sumOfDivisors == number);
    }

    // Main method to provide menu-driven functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Check if a number is a Harshad number");
            System.out.println("2. Check if a number is a perfect number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check if it is a Harshad number: ");
                    int number1 = scanner.nextInt();
                    if (isHarshad(number1)) {
                        System.out.println(number1 + " is a Harshad number.");
                    } else {
                        System.out.println(number1 + " is not a Harshad number.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter a number to check if it is a perfect number: ");
                    int number2 = scanner.nextInt();
                    if (isPerfect(number2)) {
                        System.out.println(number2 + " is a perfect number.");
                    } else {
                        System.out.println(number2 + " is not a perfect number.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
}