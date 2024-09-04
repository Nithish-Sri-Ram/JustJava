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

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // HashMap will store key and values.
        // LinkedHashMap, in addition to the above, will have two pointers - a doubly linked list with each value.
        // It will maintain the order, whereas HashMap will not.
        // We can limit the size of LinkedHashMap, but if we insert extra elements, it will start to delete the elements from the beginning to make up for the space.
        // The keys will be deleted in the order in which they are inserted.
        // It is generally stored in the inserted order, but we can define the access order for the elements too.
        // When adding extra elements, the overflow will result in the deletion of the least recently used key.
        // The ordered access and the least recently used memory are used in cached memory - for this purpose, LinkedHashMap will act as a cache of objects for you.
    
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5); // The size will increase as per the insertion of more elements.
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        
        lhm.forEach((k, v) -> System.out.println(k + " " + v));
        
        // Now we will access it based on the least accessed elements.
        
        LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<>(5, .75f, true); // Here we are setting this to be ordered based on the least accessed value.
        lhm1.put(1, "A");
        lhm1.put(2, "B");
        lhm1.put(3, "C");
        lhm1.put(4, "D");
        lhm1.put(5, "E");
        lhm1.put(6, "F");
        String s = lhm1.get(2);
        s = lhm1.get(5);
        lhm1.put(7, "G");
        
        // So the most recently accessed will be at the last.
        lhm1.forEach((k, v) -> System.out.println(k + " " + v));
        
        // To limit the size of the list, e.g., if we need the size to be maintained only at 5, 
        // then we have to override one method inside the LinkedHashMap class.
        LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>(5, .75f, true) {
            protected boolean removeEldestEntry(Map.Entry e) {  // This method will tell when to remove an element - either based on the insertion order or based on the access order.
                return size() > 5;  // So here we say - if the size is greater than 5 - start removing.
            } // For this, it will remove the least recently accessed element, and for ordered on insertion - it will remove the first entered element.
        };
    }
}
