package myfirst;

/**
 * This class demonstrates the use of regular expression meta characters in Java.
 * Meta characters include \d, \D, \s, \S, \w, \W, which help in pattern matching.
 *
 * @author nithish
 */
public class MetaCharInString {
    public static void main(String[] args) {
        // Meta character examples
        
        // \w - Matches any word character (alphanumeric characters plus underscore)
        String s = "a";
        System.out.println(s.matches("\\w"));  // true, because 'a' is a word character
        
        s = "5";
        System.out.println(s.matches("\\w"));  // true, because '5' is also a word character (digit)

        s = "#";
        System.out.println(s.matches("\\w"));  // false, because '#' is not a word character
        
        // \d - Matches any digit (0-9)
        s = "8";
        System.out.println(s.matches("\\d"));  // true, because '8' is a digit
        
        s = "a";
        System.out.println(s.matches("\\d"));  // false, because 'a' is not a digit
        
        // \D - Matches any non-digit character
        s = "8";
        System.out.println(s.matches("\\D"));  // false, because '8' is a digit
        
        s = "$";
        System.out.println(s.matches("\\D"));  // true, because '$' is not a digit
        
        // \W - Matches any non-word character (anything other than alphanumeric characters and underscore)
        s = "#";
        System.out.println(s.matches("\\W"));  // true, because '#' is not a word character
        
        s = "a";
        System.out.println(s.matches("\\W"));  // false, because 'a' is a word character
        
        s = "5";
        System.out.println(s.matches("\\W"));  // false, because '5' is a word character (digit)
        
        // \s - Matches any whitespace character (spaces, tabs, line breaks)
        s = " ";
        System.out.println(s.matches("\\s"));  // true, because it matches a space
        
        // \S - Matches any non-whitespace character
        s = "a";
        System.out.println(s.matches("\\S"));  // true, because 'a' is not a whitespace character
    }
}
