package day12.assignment;


import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        Arrays.sort(arr); // Sort the array

        System.out.println("Second Largest Element: " + arr[arr.length - 2]);
    }
}
