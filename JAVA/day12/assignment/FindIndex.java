package day12.assignment;


import java.util.Scanner;

public class FindIndex {
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
        System.out.print("Enter the value to find index: ");
        int target = scanner.nextInt();

        // Find index
        int index = -1; // Default to -1 if not found
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                index = i;
                break; // Stop searching after first occurrence
            }
        }

        // Display result
        if (index != -1) {
            System.out.println("Value " + target + " found at index " + index);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }

        scanner.close();
    }
}

