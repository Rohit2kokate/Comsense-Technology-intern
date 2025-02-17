package day12.assignment;




import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        // Copy array using iteration
        int[] copiedArray = new int[size];
        for (int i = 0; i < size; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Display copied array
        System.out.print("Copied Array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
