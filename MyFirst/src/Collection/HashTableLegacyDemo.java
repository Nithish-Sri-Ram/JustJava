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
// Presently we have HashMap and HashSet.
// This is an obsolete class - not used in recent days.
public class HashTableLegacyDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        // This will take the key-value pairs as objects.
        // This same class has a generic version.
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");
        
        // Whenever you are retrieving the values, you have to typecast.
        String s = (String) ht.get(3);
        
        // This will concatenate 'z' to the existing value "B".
        ht.compute(2, (k, v) -> v + "z");
        // If absent, the value will be inserted.
        ht.computeIfAbsent(7, (k) -> "z" + k);
        
        // Since this is a legacy class, it doesn't have an iterator, but it has something called enumeration.
        Enumeration e = ht.elements(); // This is if you want values, and if you want keys, you can use ht.keys().
        // This Enumeration has the same methods as the Iterator class.
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
