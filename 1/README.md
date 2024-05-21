# ElectricBill Class in Java

This Java program defines a class called `ElectricBill` that calculates and prints the electricity bill for a customer based on their electricity consumption. The class has three main methods to accept customer details, calculate the bill, and print the bill details.

## Class Structure

The `ElectricBill` class contains the following components:

1. **Instance Variables**:
    - `name` (String): Stores the name of the customer.
    - `units` (int): Stores the number of units of electricity consumed by the customer.
    - `bill` (double): Stores the calculated bill amount.

2. **Methods**:
    - `accept()`: This method accepts the name of the customer and the number of units consumed. It uses a `Scanner` to read input from the user.
    - `calculate()`: This method calculates the electricity bill based on the number of units consumed using a specific tariff:
        - First 100 units: Rs. 2.00 per unit
        - Next 200 units: Rs. 3.00 per unit
        - Above 300 units: Rs. 5.00 per unit, with an additional surcharge of 2.5% if consumption exceeds 300 units.
    - `print()`: This method prints the customer's name, the number of units consumed, and the calculated bill amount.

3. **Main Method**:
    - The `main` method creates an object of the `ElectricBill` class and calls the `accept`, `calculate`, and `print` methods to perform the necessary operations.

## Code Explanation

```java
import java.util.Scanner;

class ElectricBill {
    // Instance variables
    private String name;
    private int units;
    private double bill;

    // Method to accept customer details
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter customer name: ");
            name = scanner.nextLine();

            System.out.print("Enter number of units consumed: ");
            units = scanner.nextInt();
        } finally {
            scanner.close(); // Ensuring the scanner is closed
        }
    }

    // Method to calculate the bill
    public void calculate() {
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units <= 300) {
            bill = 100 * 2.00 + (units - 100) * 3.00;
        } else {
            bill = 100 * 2.00 + 200 * 3.00 + (units - 300) * 5.00;
            bill += bill * 0.025; // Adding surcharge of 2.5%
        }
    }

    // Method to print the details
    public void print() {
        System.out.println("Name of the customer: " + name);
        System.out.println("Number of units consumed: " + units);
        System.out.println("Bill amount: " + bill);
    }

    // Main method to create an object and call the methods
    public static void main(String[] args) {
        ElectricBill bill = new ElectricBill();

        bill.accept();
        bill.calculate();
        bill.print();
    }
}
