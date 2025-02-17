package day12.assignment;

import java.util.Scanner;

public class RemoveElement {
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

        // Get the element to remove
        System.out.print("Enter the element to remove: ");
        int removeValue = scanner.nextInt();

        // Count occurrences of the element
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == removeValue) {
                count++;
            }
        }

        // If the element is not found, exit
        if (count == 0) {
            System.out.println("Element not found in the array.");
            return;
        }

        // Create a new array with size reduced
        int[] newArr = new int[size - count];
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] != removeValue) {
                newArr[index++] = arr[i];
            }
        }

        // Display the new array
        System.out.print("Array after removing " + removeValue + ": ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}

