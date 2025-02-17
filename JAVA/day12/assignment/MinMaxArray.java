package day12.assignment;

import java.util.Scanner;

public class MinMaxArray {
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

        // Initialize min and max with the first element
        int min = arr[0];
        int max = arr[0];

        // Loop to find min and max
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min
            }
            if (arr[i] > max) {
                max = arr[i]; // Update max
            }
        }

        // Display the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
