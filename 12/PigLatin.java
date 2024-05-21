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
