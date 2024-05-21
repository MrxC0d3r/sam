import java.util.Scanner;

public class WordSorter {

    // Method to sort words in descending order using Selection Sort
    public static void selectionSortDescending(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the maximum element in the unsorted part
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[maxIdx]) > 0) {
                    maxIdx = j;
                }
            }
            // Swap the found maximum element with the first element
            String temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method to input words, sort them, and print the sorted array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[40];

        // Input 40 words
        System.out.println("Enter 40 words:");
        for (int i = 0; i < 40; i++) {
            words[i] = scanner.nextLine();
        }

        // Sort the words in descending order
        selectionSortDescending(words);

        // Print the sorted array
        System.out.println("Words in descending order:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
