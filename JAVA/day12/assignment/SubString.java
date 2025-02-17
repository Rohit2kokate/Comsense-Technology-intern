package day12.assignment;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter the substring to check: ");
        String subStr = scanner.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring NOT found!");
        }

        scanner.close();
    }
}
