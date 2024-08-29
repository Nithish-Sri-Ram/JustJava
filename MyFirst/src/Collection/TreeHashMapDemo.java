/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

//TreeMap implements Map as well as SortedMap - it also uses redBlack tree based implementation
//Guarenteed log n time for performing basic operations - get put and remove 


import java.util.*;
import java.util.Map.*;

//Insted of using tree we can use a hashMap 
//Just change the tree Map into hash map, not a lot of changes required
//In tree the elements will be sorted and in the hash the elements will not be sorted
//and in the map we can specify the amount of table size it has to be filled with loading factor

public class TreeHashMapDemo {
    public static void main(String args[])
    {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));  //We can initialize the key and values here too
        //Key is the integer and String is the value here
        System.out.println(tm);
        
        //We can't create an entry but we can get it's reference 
        Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
       
        
        tm.put(4,"E");
        tm.put(5,"F");
        tm.put(7,"G");
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(6).getValue());  //Since 6 is not present there we would get closest greater value
        System.out.println(tm.get(3));
        
    }
}
