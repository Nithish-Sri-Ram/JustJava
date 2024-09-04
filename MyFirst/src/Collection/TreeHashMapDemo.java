/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

// TreeMap implements Map as well as SortedMap - it also uses a Red-Black tree-based implementation.
// Guaranteed O(log n) time complexity for performing basic operations like get, put, and remove.

import java.util.*;
import java.util.Map.*;

// Instead of using a TreeMap, we can use a HashMap.
// Just change the TreeMap into a HashMap; not a lot of changes are required.
// In TreeMap, the elements will be sorted, and in HashMap, the elements will not be sorted.
// In a HashMap, we can specify the initial capacity and load factor for better performance.

public class TreeHashMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D")); // We can initialize the key and values here too.
        // Key is the Integer and String is the value here.
        System.out.println(tm);
        
        // We can't create an entry, but we can get its reference.
        Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());
        
        tm.put(4, "E");
        tm.put(5, "F");
        tm.put(7, "G");
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(6).getValue()); // Since 6 is not present, we would get the closest greater value.
        System.out.println(tm.get(3));
    }
}
