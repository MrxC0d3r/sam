# PigLatin Class in Java

This Java program converts a given word into its Pig Latin form. A Pig Latin word is generated by placing the first vowel occurring in the input word at the start of the new word along with the remaining alphabets, followed by moving the alphabets present before the first vowel to the end of the new word and adding "ay".

## Examples

- **Example 1**: paris
    - **Input**: paris
    - **Output**: arispay

## Class Structure

The `PigLatin` class contains the following components:

1. **Methods**:
    - `String toPigLatin(String word)`: This method converts a given word to its Pig Latin form. It finds the first vowel in the word, rearranges the word accordingly, and appends "ay" at the end.

2. **Main Method**:
    - The `main` method prompts the user to input a word and calls the `toPigLatin` method to convert it to Pig Latin. It then prints the result.

## Code Explanation

```java
import java.util.Scanner;

public class PigLatin {

    // Method to convert a word to Pig Latin
    public static String toPigLatin(String word) {
        word = word.toLowerCase();
        int firstVowelIndex = -1;
        String vowels = "aeiou";

        // Find the index of the first vowel
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                firstVowelIndex = i;
                break;
            }
        }

        // If no vowel is found, return the word followed by "ay"
        if (firstVowelIndex == -1) {
            return word + "ay";
        }

        // Construct the Pig Latin word
        String pigLatinWord = word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";
        return pigLatinWord;
    }

    // Main method to input a word and convert it to Pig Latin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to convert to Pig Latin: ");
        String word = scanner.nextLine();

        String pigLatinWord = toPigLatin(word);
        System.out.println("Pig Latin form: " + pigLatinWord);

        scanner.close();
    }
}