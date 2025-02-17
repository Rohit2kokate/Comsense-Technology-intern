package day12.assignment;


public class StringReplace{
    public static void main(String[] args) {
        String sentence = "I love Java programming!";
        
        // Replace a word
        String newSentence = sentence.replace("Java", "Python");
        
        System.out.println("Original: " + sentence);
        System.out.println("Modified: " + newSentence);
    }
}
