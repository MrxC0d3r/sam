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
