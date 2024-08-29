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
    public static void main(String args[])
    {
        //All these name ,address, dept 
        //and we have string tokens seperated by delimeters, then we can take out the value 
        String data="name=Vijay;address=delhi;country=India;dept=cse\nThe End";
        
        //We can mention as many delimeters as we want enclosed inside this souble quotes - each char in it is treated as a delimeter and delimeters will be in single char 
        StringTokenizer stk=new StringTokenizer(data,"=;");
        //We don't have to give new line as delimeter, and we have to give space as delimeter if need it to be considered as one 
        
        //String tokenizer has lot's of simple methods 
        String s;
        while(stk.hasMoreTokens())
        {
            //The methods of tokens are just like methods of itereator 
            s=stk.nextToken();
            System.out.println(s);
        }
        
        String num="1,2,3,4,5";
        ArrayList<Integer> ar=new ArrayList<>();
        StringTokenizer str=new StringTokenizer(num,",");
        while(str.hasMoreTokens())
        {
            s=str.nextToken();
            ar.add(Integer.valueOf(s));
            
        }
        System.out.println(ar);
    }
}
