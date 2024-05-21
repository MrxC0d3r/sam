# StudentSorter Class in Java

This Java program inputs the names and percentages of 35 students in separate one-dimensional arrays, sorts them in descending order using the Bubble Sort method, and displays the names and percentages of the top ten students.

## Class Structure

The `StudentSorter` class contains the following components:

1. **Method**:
    - `bubbleSortDescending(String[] names, double[] percentages)`: This method sorts the students' details (names and percentages) in descending order using the Bubble Sort algorithm. It compares adjacent elements and swaps them if they are in the wrong order.

2. **Main Method**:
    - The `main` method inputs the names and percentages of 35 students, sorts them using the `bubbleSortDescending` method, and prints the names and percentages of the top ten students.

## Code Explanation

```java
import java.util.Scanner;

public class StudentSorter {

    // Method to sort students' details in descending order using Bubble Sort
    public static void bubbleSortDescending(String[] names, double[] percentages) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (percentages[j] < percentages[j + 1]) {
                    // Swap percentages
                    double tempPercentage = percentages[j];
                    percentages[j] = percentages[j + 1];
                    percentages[j + 1] = tempPercentage;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }

    // Main method to input students' names and percentages, sort them, and print the top ten students
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[35];
        double[] percentages = new double[35];

        // Input names and percentages of 35 students
        System.out.println("Enter the names and percentages of 35 students:");
        for (int i = 0; i < 35; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Percentage of student " + (i + 1) + ": ");
            percentages[i] = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character
        }

        // Sort the students' details in descending order
        bubbleSortDescending(names, percentages);

        // Print the names and percentages of the top ten students
        System.out.println("Top ten students:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + percentages[i] + "%");
        }

        scanner.close();
    }
}