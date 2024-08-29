/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

//offerFirst() does the same as addFirst but - addFirst() when unable to add an element will throw an exception whereas offerFirst() doesn't 
//Better altenative ton use on the right side
//addFirst()    -   offerFirst()
//addLast()    -   offerLast()
//removeLast()    -   pollLast()
//removeFirst()    -   pollFirst()
//getFirst()    -   peekFirst()
//getLast() - peekLast()
//The right side will return null if unable to do the operations and won't throw exception and It is much safer     
//Dequeue is much faster from the legacy Stack class  
//And it is better to use ArrayDeque for impletnting queue too

import java.util.*;

public class ArrDequeueDemo {
    public static void main(String args[])
    {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        
        System.out.println(dq.size());
        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
//        dq.forEach(n->System.out.println(n));
        
        dq.offerFirst(4);
        dq.offerFirst(3);
        dq.offerFirst(2);
        dq.offerFirst(1);
        
       
        
        dq.forEach(n->System.out.print(n+" "));
        
    }
}
