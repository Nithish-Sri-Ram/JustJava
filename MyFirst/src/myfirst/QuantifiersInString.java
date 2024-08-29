/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirst;

/**
 *
 * @author nithish
 */
public class QuantifiersInString {
    public static void main(String []args)
    {
        // .* => any charecter can come any nomber of times 0 or more, [abc]* => abc can come any no of times
         // .+ => one or more times
        // .? => 0 or 1 time 
        // .{X} => exactly X times
        // /{x,y} =>between X and Y time 
        String s="234^4abcdef";
        System.out.println(s.matches(".*"));    //true
        s="234 ^4  abcdef";
        System.out.println(s.matches(".*"));    //true
        s="abcdebbaaf";
        System.out.println(s.matches("[a-z]*"));    //true
        s="abc5deBf";
        System.out.println(s.matches("[a-z]*"));    //false
        s="acc";
        System.out.println(s.matches("[abc]{3}"));    //true
        s="accbb";
        System.out.println(s.matches("[abc]{3}"));    //false
        System.out.println(s.matches("[abc]{3,7}"));    //true
        
       //With the above gained knowledge we'll check if a given mail is of only gmail.com
       String e="jointnap@gmail.com";
       System.out.println(e.matches(".*gmail.*"));  //true
       //now check before '@' symbol the only allowed chars are alphabets and numbers 
       System.out.println(e.matches("\\w*@gmail.*"));   //true
       e="joint-nap@gmail.com";
       System.out.println(e.matches("\\w*@gmail.*"));   //false
       
       
       //Challenge 1
       //find if email id is on gmail
       //find username and domain name from email
       String str="programmer@gmail.com";
       int ind=str.lastIndexOf("@");
       System.out.println("The username is :"+str.substring(0,ind)+", The domain name is: "+str.substring(ind));
       String domain=str.substring(ind+1);
       System.out.println(domain.equals("gmail.com"));
       System.out.println(domain.startsWith("gmail"));
       
       
       //Challenge 2
       //Find if a number is binary or not
       String bin="0101000100";
       System.out.println(bin.matches("[01]*"));
       bin="0101000103";
       System.out.println(bin.matches("[01]*"));
       int b=10001011;
       String bs=String.valueOf(b);
       System.out.println(bs);
       
       //Find if a number is hexadecimal or not
       String hd="032A42389BC";
       System.out.println(hd.matches("[0-9A-F]*"));
       
       //Find the data on date format (dd/mm/yy)
       String dt="24/02/2003";
       System.out.println(dt.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
       dt="24/02/20035";
       System.out.println(dt.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
       
       //Challenge 3
       //Remove special characters from the string
       str="a!B@c#1$2%3m";
       str=str.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(str);
       //Remove extra spaces from the string 
       str="  abc  defgh i j  k  ";
       str=str.replaceAll("\\s+"," ").trim();
       System.out.println(str);
       
       //Find No of words in a string
       //for this purpose we trim the spaces as we did from the previous example
       //additionally we use the split method to derermine the word count
       String words[]=str.split("\\s");
       System.out.println(words);
       System.out.println(words.length);
       
    }
}
