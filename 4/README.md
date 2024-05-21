# SumFunctions Class in Java

This Java program defines a class called `SumFunctions` that overloads the `Sum` method to perform different calculations based on the provided arguments. The class has methods to calculate the sum of even numbers in a range, the product of a series, and the sum of odd digits of a number.

## Class Structure

The `SumFunctions` class contains the following components:

1. **Methods**:
    - `int Sum(int A, int B)`: This method takes two integer arguments (A and B) and returns the sum of all even numbers in the range from A to B (inclusive).
        - **Sample Input**: A = 4, B = 16
        - **Sample Output**: sum = 4 + 6 + 8 + 10 + 12 + 14 + 16 = 70

    - `double Sum(double N)`: This method takes one double argument (N) and returns the product of the series 1.0 x 1.2 x 1.4 x ... x N.
        - **Sample Input**: N = 2.0
        - **Sample Output**: product = 1.0 x 1.2 x 1.4 x 1.6 x 1.8 x 2.0

    - `int Sum(int N)`: This method takes one integer argument (N) and returns the sum of only the odd digits of the number N.
        - **Sample Input**: N = 43961
        - **Sample Output**: sum = 3 + 9 + 1 = 13

2. **Main Method**:
    - The `main` method creates an object of the `SumFunctions` class and calls its overloaded `Sum` methods to perform the necessary calculations and display the results.

## Code Explanation

```java
class SumFunctions {

    // Method to calculate sum of all even numbers in the range of A and B
    public int Sum(int A, int B) {
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to calculate the product of the series 1.0 x 1.2 x 1.4 x ... x N
    public double Sum(double N) {
        double product = 1.0;
        for (double i = 1.0; i <= N; i += 0.2) {
            product *= i;
        }
        return product;
    }

    // Method to calculate sum of only odd digits of the number N
    public int Sum(int N) {
        int sum = 0;
        while (N > 0) {
            int digit = N % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            N /= 10;
        }
        return sum;
    }

    // Main method to create an object and call the methods
    public static void main(String[] args) {
        SumFunctions obj = new SumFunctions();

        // Sample inputs
        int A = 4;
        int B = 16;
        double N_double = 2.0; // Change this value as needed for testing
        int N_int = 43961;

        // Calling the methods and printing the results
        int sumEvenRange = obj.Sum(A, B);
        double productSeries = obj.Sum(N_double);
        int sumOddDigits = obj.Sum(N_int);

        // Displaying results
        System.out.println("Sum of all even numbers between " + A + " and " + B + " is: " + sumEvenRange);
        System.out.println("Product of the series up to " +
