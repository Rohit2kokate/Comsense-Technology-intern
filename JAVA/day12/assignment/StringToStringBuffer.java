package day12.assignment;


public class StringToStringBuffer {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Convert String to StringBuffer
        StringBuffer sb = new StringBuffer(str);
        
        System.out.println("Original String: " + str);
        System.out.println("Converted StringBuffer: " + sb);
    }
}
