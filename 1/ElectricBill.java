import java.util.Scanner;

class ElectricBill {
    // Instance variables
    private String name;
    private int units;
    private double bill;

    // Method to accept customer details
    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = scanner.nextLine();

        System.out.print("Enter number of units consumed: ");
        units = scanner.nextInt();
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
