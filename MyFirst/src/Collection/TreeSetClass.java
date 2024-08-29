/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

//This class clso supports comparable interface available in this 
//This TreeSet class provides  guarenteed log n time complexity for basic operations - add, remove and contains
//This class is implementing SortedSet, Set and NavigableSet and etc

import java.util.*;

public class TreeSetClass {
    public static void main(String args[])
    {
        
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        System.out.println(ts.ceiling(55)); //It will print the nearest number to 55 which is greater tha n this which is 70
        System.out.println(ts.ceiling(77)); //It will print the nearest number to 77 which is null
//Ceiling will give the nearest greater value         
//Floor is in contrast to ceil which will give the nearest smaller value
        
    Collection<Integer> tss=new TreeSet<>();
    //We can have the collection interface too but we can't use the methods like floor and celing which are present in the TreeSet 
    //We could only use the methods present in the collection interface 
    //SInce it is implementing a SortedSet we could have that reference to hold this object but could only access the methods present in the SortedSet
    //The point is any reference we could use for holding the objcect but could only use the methods avilable in the reference 

    ts.add(25);
        
        //By default the elements are in sorted order and the aobve inserted element will also be added in the sorted position 
        System.out.print(ts);
    }
}
