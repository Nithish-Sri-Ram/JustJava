/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class RegularExpressionsMatchingSymbolsInString {
    public static void main(String [] args)
    {
        String s="f";
        
        System.out.println(s.matches(".")); //Checks if it is a char and only it should be 1 char
        //Gives true for all the below cases with single char and false for the one with multiple chars
        s="8";
        System.out.println(s.matches("."));
        s="%";
        System.out.println(s.matches("."));
        s="abc";
        System.out.println(s.matches(".")); 
        
        s="a";
        System.out.println(s.matches("[abc]")); //THis means that I can have only one char but it should be among 'abc'
        //The above is true when s is havinn a or b or c else false
        s="p";
        System.out.println(s.matches("[abc]"));     //prints false
        System.out.println(s.matches("[^abc]"));     //It should contain numbers other than abc - prints true
        
        
        //For a range taking the below example 
        s="p";  //Returns true
        System.out.println(s.matches("[a-z0-9]"));
        s="%";  //RTeturns false
        System.out.println(s.matches("[a-z0-9]"));
        s="A";  //false
        System.out.println(s.matches("[a-z0-9]"));
        System.out.println(s.matches("[a-zA-Z0-9]"));   //true
        s="7";  //True
        System.out.println(s.matches("[a-z0-9]"));
        
        //For the below example we use combination of the two -  one single element won't be accepted
        s="a7";  //true
        System.out.println(s.matches("[a-z][0-9]"));
        s="k8"; //true
        System.out.println(s.matches("[a-z][0-9]"));
        s="k$"; //false
        System.out.println(s.matches("[a-z][0-9]"));
        s="k";  //false
        System.out.println(s.matches("[a-z][0-9]"));
        
        //The or matching
        s="b";//True
        System.out.println(s.matches("a|b"));
        s="p";//false
        System.out.println(s.matches("a|b"));
        
        //Exactly has to be equal
        s="abc";
        System.out.println(s.matches("abc"));   //true
        System.out.println(s.matches("ab"));    //false

    }
}
