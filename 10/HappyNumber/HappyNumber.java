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
