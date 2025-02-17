package day12.assignment;

import java.util.Scanner;

public class InsertElement {
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

        // Get element and position to insert
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter the position (index) to insert at: ");
        int position = scanner.nextInt();

        // Validate position
        if (position < 0 || position > size) {
            System.out.println("Invalid position! Position should be between 0 and " + size);
            return;
        }

        // Create a new array with increased size
        int[] newArr = new int[size + 1];

        // Copy elements while inserting new one
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = element; // Insert new element at the given position
            } else {
                newArr[i] = arr[j]; // Copy from original array
                j++;
            }
        }

        // Display new array
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
