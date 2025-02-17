package day12.assignment;


public class StringToChar {
    public static void main(String[] args) {
        String str = "Hello";
        
        // Convert String to Character Array
        char[] charArray = str.toCharArray();
        
        // Print each character
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
