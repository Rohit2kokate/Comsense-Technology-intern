package day12.assignment;
import java.util.Scanner;

public class CommonElement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get size of both arrays
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter " + size1 + " elements for first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter " + size2 + " elements for second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Find common elements
        System.out.print("Common elements: ");
        boolean hasCommon = false;

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    hasCommon = true;
                    break; // To avoid printing duplicate common elements
                }
            }
        }

        if (!hasCommon) {
            System.out.print("None");
        }

        System.out.println();
        scanner.close();
    }
}
