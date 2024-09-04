/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

import java.util.*;

public class TokenizerDemo {
    public static void main(String[] args) {
        // All these names: name, address, dept, etc.
        // We have string tokens separated by delimiters; we can extract the values.
        String data = "name=Vijay;address=delhi;country=India;dept=cse\nThe End";
        
        // We can specify as many delimiters as we want, enclosed inside double quotes - 
        // each character in it is treated as a delimiter, and delimiters will be a single character.
        StringTokenizer stk = new StringTokenizer(data, "=;");
        // We don't have to give a new line as a delimiter, but we have to give space as a delimiter if we need it to be considered as one.
        
        // StringTokenizer has lots of simple methods.
        String s;
        while (stk.hasMoreTokens()) {
            // The methods of StringTokenizer are just like methods of Iterator.
            s = stk.nextToken();
            System.out.println(s);
        }
        
        String num = "1,2,3,4,5";
        ArrayList<Integer> ar = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(num, ",");
        while (str.hasMoreTokens()) {
            s = str.nextToken();
            ar.add(Integer.valueOf(s));
        }
        System.out.println(ar);
    }
}
