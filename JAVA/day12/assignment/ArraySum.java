package day12.assignment;
import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numbers);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numbers));
        
        // String array
        String[] names = {"John", "Alice", "Bob", "David"};
        Arrays.sort(names);
        System.out.println("Sorted String Array: " + Arrays.toString(names));
        
        // Sum of numeric array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of Numeric Array: " + sum);
    }
}
