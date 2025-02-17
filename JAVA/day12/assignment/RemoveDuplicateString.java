package day12.assignment;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class RemoveDuplicateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split words by space
        String[] words = sentence.split("\\s+");

        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        // Convert back to String
        String result = String.join(" ", uniqueWords);

        System.out.println("Without Duplicates: " + result);
        scanner.close();
    }
}
