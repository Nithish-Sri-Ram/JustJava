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
//Presently we have hashmap and hashSet 
//THis is an obsolute classs - not used in the recent days 
public class HashTableLegacyDemo {
    public static void main(String args[])
    {
        Hashtable ht=new Hashtable();
        //This will take the key value pairs as objects 
        //This same class has  a generic version 
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");
        
        //Whenever you are retriving the values youn have to type cast 
        String s=(String)ht.get(3);
        
        //This will concate z to the existing B 
        ht.compute(2, (k,v)->v+"z");
        //If absent the value will be inserted
        ht.computeIfAbsent(7, (k)->"z"+k);
         
        
        //SInce this is a legacy class it doesn't have an iterator but it has something called enumeration
        Enumeration e=ht.elements();    //This is if want calues ans if we want keys we can use ht.keys()
        //this e has the same methods as the iterator class 
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
            
        }
        
    }
}
