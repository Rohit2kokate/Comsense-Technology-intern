package day12.assignment;
import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the search value
        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();

        // Search for the value
        boolean found = false;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == searchValue) {
                found = true;
                index = i;
                break; // Stop searching once found
            }
        }

        // Display result
        if (found) {
            System.out.println("Value " + searchValue + " found at index " + index);
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

        scanner.close();
    }
}
