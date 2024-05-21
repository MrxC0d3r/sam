import java.util.Scanner;

public class StringCheck {

    // Method to find and print the frequency of a character in a string
    public void check(String str, char ch) {
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println("Number of '" + ch + "' present in the string \"" + str + "\" is: " + frequency);
    }

    // Method to display only vowels from a string after converting it to lower case
    public void check(String s1) {
        s1 = s1.toLowerCase();
        System.out.print("Vowels in the string \"" + s1 + "\" are: ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringCheck checker = new StringCheck();

        // Test case for first check method
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to find its frequency: ");
        char ch = scanner.next().charAt(0);
        checker.check(str, ch);

        // Test case for second check method
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter a string to display its vowels: ");
        String s1 = scanner.nextLine();
        checker.check(s1);

        scanner.close();
    }
}
