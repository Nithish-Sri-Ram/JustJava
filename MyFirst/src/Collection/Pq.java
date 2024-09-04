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

// This class represents a heap data structure.

class MyCom implements Comparator<Integer> {
    // This comparator will sort in descending order.
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) return 1;  // Usually, it should return -1 by convention.
        if (o1 > o2) return -1;    
        return 0;
    }
}

public class Pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> b - a  // We could declare this comparator like this to decide the ordering of the elements in the heap, either high to low or low to high.
        );                    // Generally, it would be a minHeap. We have to change it to a maxHeap - for that, we could implement a comparator class to do the deed.
        
        pq.add(10);
        pq.add(23);
        pq.add(55);
        pq.add(1);
        pq.add(9);
        pq.add(4);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new MyCom());
        pq2.add(44);
        pq2.add(45);
        pq2.add(46);
        pq2.add(47);
        pq2.add(48);
        pq2.add(49);
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
    }
}
