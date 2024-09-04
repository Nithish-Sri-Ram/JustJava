package LangPackages;

/**
 * Demonstrates the differences between String, StringBuffer, and StringBuilder in Java.
 * 
 * @author nithish
 */

public class StringBufferBuilder {
    public static void main(String[] args) {
        // String class (immutable)
        String s1 = new String("Hello");
        
        // StringBuffer class (mutable, thread-safe)
        StringBuffer s2 = new StringBuffer("Hello");
        
        // StringBuilder class (mutable, not thread-safe)
        StringBuilder s3 = new StringBuilder("Hello");

        // String's concat method doesn't modify the original string because it's immutable.
        s1.concat(" World");
        
        // StringBuffer's append method modifies the original string.
        s2.append(" World");
        
        // StringBuilder's append method modifies the original string.
        s3.append(" World");

        // Output the results
        System.out.println("String: " + s1);         // Output: Hello (since String is immutable)
        System.out.println("StringBuffer: " + s2);   // Output: Hello World
        System.out.println("StringBuilder: " + s3);  // Output: Hello World
    }
}
