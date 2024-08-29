/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */

public class strBuilder {
    public static void main(String args[])
    {
        String str="Hello";
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb1);
        System.out.println(sb1.length());
        
        //append function is available in string builder
        sb1.append(" World");
        
        //insert can also be done - the range will be from 0 to the length of the string
        sb1.insert(0, "Say ");
        sb1.insert(sb1.length(), " to everyone");
        System.out.println(sb1);
        
        //we can replace a charecter at a particular index
        sb1.setCharAt(4, 'b');
        System.out.println(sb1);
        String s=sb1.toString();    //now when we are done with the modifications we can convert it back to string
        
        //challenge problem - replace Ascii - "ceEfG" to "dcFeH"
        String q="cdEfG";
        System.out.println(replaceAsciiFunc(q));
    }
    public static String replaceAsciiFunc(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(i%2==0)
            {
                ch=(char)(ch+1);
                sb.setCharAt(i, ch);
            }
            else
            {
                ch=(char)(ch-1);
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
}
