package day12.assignment;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {


    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 8, 9, 9, 1};

        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert HashSet to an array
        int[] result = new int[uniqueElements.size()];
        int i = 0;
        for (int num : uniqueElements) {
            result[i++] = num;
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
