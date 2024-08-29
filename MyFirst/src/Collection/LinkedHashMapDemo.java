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
    public static void main(String args[]){
        //HashMap will store key and values 
        //Linked HashMap along with the above will have 2 poiters - doubly linked list with with each value
        // it will maintain the order whwere as hash map will not 
        //we can limit the size of linked Hash map - but if we insert extra elements It will start to delete the elements from the beginning to make up for the space 
        //The keys will be deleted in the order in which they are inserted 
        //It is genarally stored in the inserted order but we can define the access order for the elements too - for this when adding an extra elements the overflow will result in the deletion of least recently used key wil be deleted 
        //The Orederd access and the least recently used memory is used in the cached memory - for this purpose the LinkedHashMap will act as a cage of object for you 
    
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);       //The size will increase as per insertion of more elements
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
        //Now we will access it on the basis of least accessed elements
        
        LinkedHashMap<Integer,String> lhm1=new LinkedHashMap<>(5,.75f,true);       //Here we are setting this to be ordered based on the least accessed value
        lhm1.put(1, "A");
        lhm1.put(2, "B");
        lhm1.put(3, "C");
        lhm1.put(4, "D");
        lhm1.put(5, "E");
        lhm1.put(6, "F");
        String s=lhm1.get(2);
        s=lhm1.get(5);
        lhm1.put(7, "G");
        
//        So the most recently accessed will be at the last
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
        
        //To limit the size of the list, eg: if we need the size to be maintained only at 5, then we have to override one method inside the linkedHashMap class
        LinkedHashMap<Integer,String> lhm2=new LinkedHashMap<>(5,.75f,true){
            protected boolean removeEldestEntry(Map.Entry e)    //This method will tell when to remove an element - either based on the insertion order or based on the access order 
            {
                return size()>5;        //So here we say - if the size is greater than 5 - start removing
            }   //For this - this will remove the least recently accessed element and for ordered on insertion - it will remove the first entered element
        };
         
    }
}
