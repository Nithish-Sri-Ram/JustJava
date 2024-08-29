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

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;   //Usually it will be -1 to be in ascending 
        if(i1>i2)
            return 2;   //Now we are reversing the order 
        return 0;
    }   //Now if we sort using this comparator - it will sort in decendnig order - for generic types we can pass comparator
}
public class ComparatorDemo {
    public static void main(String args[])
    {
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,8,1,3,5,7};
        
        //There is very interesing class called arrays and now we'll look at it's methods
        System.out.println(Arrays.compare(a, b)); //This methods compares the array both by size and the elements present in the array
        //It will return -1,0 and 1 according to the values present 
        
        int c[]=Arrays.copyOf(a, a.length); //This will copy all the elments of array a to c
        Arrays.fill(c, 10);     //THis will fill the whole c array with the elements 10
        
        //Arrays class has binary serach method, mismatch method and parallel sort(MergeSort using multithreading)
        //If array is small use Arrays.sort else if Array is large use Arrays.parallelSort()
        
        
        Integer arr[]={2,4,6,8,1,3,5,7};    //These are not integer primitive these are the objects of wrapper class Integer
        //For sorting comparision is very important - for comparision we can write our own comparator 
    
        Arrays.sort(arr,new My());
        
        for(Integer x:arr)
            System.out.print(x+" ");
    }
}
