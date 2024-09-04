/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

// This class also supports the Comparable interface available in it.
// The TreeSet class provides guaranteed O(log n) time complexity for basic operations - add, remove, and contains.
// This class implements SortedSet, Set, NavigableSet, and other interfaces.

import java.util.*;

public class TreeSetClass {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
        System.out.println(ts.ceiling(55)); // It will print the nearest number to 55 that is greater than this, which is 70.
        System.out.println(ts.ceiling(77)); // It will print null because there is no number greater than 77.
        // Ceiling will give the nearest greater value.
        // Floor, in contrast to ceiling, will give the nearest smaller value.
        
        Collection<Integer> tss = new TreeSet<>();
        // We can have the Collection interface too, but we can't use the methods like floor and ceiling, which are present in the TreeSet.
        // We could only use the methods present in the Collection interface.
        // Since it is implementing SortedSet, we could have that reference to hold this object but could only access the methods present in the SortedSet.
        // The point is, any reference can be used for holding the object but can only use the methods available in that reference.

        ts.add(25);
        
        // By default, the elements are in sorted order, and the above inserted element will also be added in the sorted position.
        System.out.print(ts);
    }
}
