/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class MetaCharInString {
    public static void main(String []args)
    {
        //The same above process can be done using meta characters
        //   \d -checks if the char or string is digit 
        //   \D -checks if the char or string is not a digit - it can be a special char or a something other than digit
        // \s for space \S for not space
        // \w alphabets or digits, \W Neither alphabets or digits
        
        // \w
        String s="a";
        System.out.println(s.matches("\\w"));       //true
        s="5";
        System.out.println(s.matches("\\w"));       //false
        
        // \d
        s="8";
        System.out.println(s.matches("\\d"));       //true
        s="a";
        System.out.println(s.matches("\\d"));       //false
        
        // \D
        s="8";
        System.out.println(s.matches("\\D"));       //false
        s="$";
        System.out.println(s.matches("\\D"));       //true
        
        // W - other than digits or char
        System.out.println(s.matches("\\W"));       //true
        
    }
}
