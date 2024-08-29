/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMasteryCourse;

/**
 *
 * @author nithish
 */

import java.util.*;

public class IntersectionOf2Arrays {
    public static ArrayList<Integer> Intersection(int a[],int b[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<b[j])
                i++;
            else if(b[j]<a[i])
                j++;
            else
            {
                arr.add(a[i]);
                i++;
                j++;
            }
        }
        return arr;
    }    
    public static void main(String args[])
    {
        int one[]={1,2,10,20,30,40,77,90};
        int two[]={4,5,20,40,90,111};
        System.out.println(Intersection(one,two));
    }
}
