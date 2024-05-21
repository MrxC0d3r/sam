# WordCheck Class in Java

This Java program checks whether a given word is a palindrome or a special word. A special word is a word that starts and ends with the same letter. A palindrome is a word that reads the same from left to right and vice-versa.

## Examples

- **Special Words**:
    - EXISTENCE
    - COMIC
    - WINDOW

- **Palindrome Words**:
    - MALAYALAM
    - MADAM
    - LEVEL
    - ROTATOR
    - CIVIC

## Class Structure

The `WordCheck` class contains the following components:

1. **Methods**:
    - `boolean isPalindrome(String word)`: This method checks if the given word is a palindrome by comparing characters from both ends towards the center.
    - `boolean isSpecialWord(String word)`: This method checks if the given word is a special word by comparing the first and last characters.

2. **Main Method**:
    - The `main` method prompts the user to input a word and checks if it is a palindrome or a special word. It then prints the appropriate message based on the result.

## Code Explanation

```java
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
