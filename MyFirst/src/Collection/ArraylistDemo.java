/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;

/**
 *
 * @author nithish
 */
public class ArraylistDemo {
    public static void main(String [] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
    
        ArrayList<String> str=new ArrayList<>();
    
        str.add("Java");
        str.add("JavaScript");
        str.add("MySQL");
        str.add(2,"swift");
        System.out.print(str.size());
        System.out.println(str);
        
        str.set(1,"C++");
        System.out.println(str);
        
        str.remove(2);
        
        System.out.println(str);
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        
        
        arr.forEach(n->System.out.print(n+" "));
        
        System.out.println();
        arr.forEach(System.out::println);       //System.out is a reference and I'm giving println as a method - actually this becomes an expression - so we utilize this println of this System.out
        System.out.println();
        //Insted of Iterator we can also use the ListIterator 
        for(Iterator<Integer> it=arr.iterator();it.hasNext();)
        {
            int x=it.next();
            System.out.print(x+" ");
        }
        
    }
    
}
