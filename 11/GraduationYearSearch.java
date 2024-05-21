import java.util.Scanner;

public class GraduationYearSearch {

    // Method to perform binary search on a sorted array
    public static boolean binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return true;
            }

            // If key greater, ignore left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Key was not found in the array
        return false;
    }

    // Main method to input year and search in the array
    public static void main(String[] args) {
        int[] graduationYears = {1982, 1987, 1993, 1996, 2003, 2006, 2007, 2009, 2010};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year of graduation: ");
        int year = scanner.nextInt();

        if (binarySearch(graduationYears, year)) {
            System.out.println("Record exists.");
        } else {
            System.out.println("Record does not exist.");
        }

        scanner.close();
    }
}