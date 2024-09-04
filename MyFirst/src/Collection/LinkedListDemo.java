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

public class LinkedListDemo {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(11, 42, 33, 96, 17, 27, 77, 23, 55, 19, 27, 66, 77, 27));
        
        ll1.offerFirst(99);
        ll1.offerFirst(88);
        ll1.addAll(ll2);
        System.out.println(ll1);
        
        ll1.poll();
        System.out.println(ll1);
        
        ll1.pollLast();
        System.out.println(ll1);
        
        ll1.pollFirst();
        System.out.println(ll1);
        
        ll1.pop();
        System.out.println(ll1);
        
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        
        ll1 = ll1.reversed();  // Assuming `reversed()` is a method that returns a reversed LinkedList.
        System.out.println(ll1);
        
        System.out.println(ll1.removeFirst());
        System.out.println(ll1);
        
        System.out.println(ll1.descendingIterator());
        
        ListIterator<Integer> it = ll1.listIterator();
        System.out.println(it.next() + " " + it.next() + " " + it.previous() + " " + it.previousIndex() + " " + it.nextIndex());
        
        System.out.println(ll1.element());
        System.out.println(ll1.spliterator());
    }
}
