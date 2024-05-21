import java.util.Scanner;

public class WordCheck {

    // Method to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a word is a special word
    public static boolean isSpecialWord(String word) {
        return word.charAt(0) == word.charAt(word.length() - 1);
    }

    // Main method to input a word and check if it is a palindrome or a special word
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine().toUpperCase();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else if (isSpecialWord(word)) {
            System.out.println(word + " is a special word.");
        } else {
            System.out.println(word + " is neither a palindrome nor a special word.");
        }

        scanner.close();
    }
}
