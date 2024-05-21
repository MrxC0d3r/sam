import java.util.Scanner;

public class BookFair {
    // Instance variables
    private String BName;
    private double price;

    // Parameterized constructor to initialize data members
    public BookFair(String BName, double price) {
        this.BName = BName;
        this.price = price;
    }

    // Method to calculate the price after discount
    public void calculate() {
        double discount;
        if (price <= 1000) {
            discount = 0.02 * price;
        } else if (price <= 3000) {
            discount = 0.10 * price;
        } else {
            discount = 0.15 * price;
        }
        price -= discount;
    }

    // Method to display the name and price of the book after discount
    public void display() {
        System.out.println("Book Name: " + BName);
        System.out.println("Price after discount: Rs. " + price);
    }

    // Main method to create an object of the class and call the methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input book details
        System.out.print("Enter the name of the book: ");
        String name = scanner.nextLine();
        System.out.print("Enter the price of the book: ");
        double price = scanner.nextDouble();

        // Create an object of BookFair
        BookFair book = new BookFair(name, price);

        // Calculate discount and display details
        book.calculate();
        book.display();

        scanner.close();
    }
}
