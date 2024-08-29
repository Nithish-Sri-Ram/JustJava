/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */

import java.util.*;
public class ArrayListDemo {
     public static void show(int x)
    {
        if(x>50)
        {
            System.out.println(x);
        }
    }
    public static void main(String []args)
    {
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0, 7);
        al1.addAll(1,al2);
        
        System.out.println(al1.contains(50));
        System.out.println(al1.get(3));
        System.out.println(al1.indexOf(70));
        System.out.println(al1.add(70));
        System.out.println(al1.lastIndexOf(70));
        System.out.println(al1.set(6, 100));
        System.out.println(al1);
        
//        al1.clear();
        
        //Various ways to traverse through the arraylist
        for(int i=0;i<al1.size();i++)
        {
            System.out.println(al1.get(i));
        }
        for(Integer x:al1)
        {
            System.out.println(x);
        }
        for(var x:al1)
        {
            System.out.println(x);
        }
        for(Iterator<Integer> it=al1.iterator();it.hasNext();)
        {
            java.lang.Integer x=it.next();
            System.out.println(x);
        }
        for(java.lang.Integer x:al1)
        {
            System.out.println(x);
        }
        al1.forEach((x)->{
            System.out.println(x);
        });
//        Iterator<Integer> it=al1.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        //Iterator allows only forward direction and listiterator allows bidirectional 
        ListIterator<Integer> it=al1.listIterator();    //hasNext() and hasPrevious() available along with precious and next
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        //lambda expression 
        al1.forEach(x->System.out.println(x));
        al1.forEach(x->show(x));
        
        
        
        al1.forEach(System.out::println);
    }
}
