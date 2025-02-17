package day12.assignment;
import java.util.Scanner;

public class DuplicateString {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get array size
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        String[] arr = new String[size];

	        // Input elements
	        System.out.println("Enter " + size + " strings:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextLine();
	        }

	        // Find duplicates
	        System.out.print("Duplicate values: ");
	        boolean hasDuplicates = false;

	        for (int i = 0; i < size; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (arr[i].equals(arr[j])) {
	                    System.out.print(arr[i] + " ");
	                    hasDuplicates = true;
	                    break; // Avoid printing the same duplicate multiple times
	                }
	            }
	        }

	        if (!hasDuplicates) {
	            System.out.print("None");
	        }

	        System.out.println();
	        scanner.close();
	    }
	}
