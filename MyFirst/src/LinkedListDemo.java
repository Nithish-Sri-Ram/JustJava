/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nithish
 */


//Variable size Collection - ArrayList and LinkedList
//Distinct Collection - Set
//Sorted and distinct - SortedSet
//Advantages of collection framework - not required to write the logic for insert,delete and searching
//Hashing (key,value) pair

//Collection - Group of Elements
//List - collection with indexing 

//Set of interfaces extending each other makes the collection framework
//Iterator->collection->[list->(ArrayList, LinkedList, Vector, Stack), Queue->(Deque,PQ,ArrayDeque),Set->(SortedSet,TreeSet,HashSet,LinkedHashSet)
//List-Can have duplicates, ordered

//Set-Can't have duplicates, unordered (Mostly useful for searching

//Also we hava map data set - it comes from a seperate hirarchy - it has (Treemap(sortedMap),hashmap,LinkedHashMap,HashTable)

//Collection supports any type of object - they are called generic
import java.util.*;

/**
 *
 * @author nithish
 */
public class LinkedListDemo{

    /**
     *
     * @param args
     */
    public static void main(String []args)
    {
        
        
        
        
        
        LinkedList<Integer> ll1=new LinkedList<>();
        LinkedList<Integer> ll2=new LinkedList<>(List.of(1,2,3,4));
        ll1.add(10);
        ll1.add(11);
        ll2.add(12);
        ll2.add(15);
        ll1.addAll(ll2);
        
        ll1.forEach(x->System.out.println(x));
        
        ll1.forEach((x)->{
        System.out.println(x);
        });
        
        ll1.clone();
        ll2=(LinkedList) ll1.clone();
        System.out.print(ll1);
        System.out.print(ll2);
        
        Iterator<Integer> it=ll1.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        System.out.print(ll1);
        ListIterator<Integer> li=ll1.listIterator(3);
        ll1.set(1,9);
        li.toString();
        
    }
}
