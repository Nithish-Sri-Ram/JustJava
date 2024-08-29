/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author nithish
 */

    //In the constructor of HashSet along with the initialCapacity we can specify the loadFactor too - out of 100 free spaces we want to store only 50 elements then the loading factor is 0.5
//By default the loading factor will be 0.75 - we can modify it between 0 and 1


//If and only if you need add and remove in constant time then use HashSet othwerWise don't cuz they use lot of memory - which can be controlled by using the loading factor
import java.util.*;
public class HashSetDemo {
    public static void main(String args[])
    {
        //Hash table when printed will not be in the dame order as they are inserted 
//        HashSet<Integer> hs=new HashSet<>(20,0.25f);  -    here we mention that only 5 elements of initial size 20 will be filled - if required the size will be increased automatically
        HashSet<Integer> hs=new HashSet<>();
    }
}
