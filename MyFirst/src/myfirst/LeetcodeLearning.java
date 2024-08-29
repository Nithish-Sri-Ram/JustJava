package myfirst;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author nithish
 */
public class LeetcodeLearning {
    public static void main(String [] args)
    {
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
//        hm.put(1, 3);
//        hm.put(2, 3);
//        hm.put(3,1);
        
//        for(Map.Entry<Integer,Integer> j: hm.entrySet())
//        {
//            if(j.getValue()<2)
//                hm.remove(j.getKey());
//            System.out.println(j.getKey()+" "+j.getValue());
//        }
        System.out.println(hm.size());
        
        ArrayList<List<String>> arr=new ArrayList<List<String>>();
        ArrayList<String> subArr=new ArrayList<String>();
        String a="apple";
        String b="b";
        subArr.add(a);
        subArr.add(b);
        arr.add(subArr);
        List<Integer> x =  new ArrayList<Integer>(List.of(7,6,5,4));
        List<Integer> y =  new ArrayList<Integer>(Arrays.asList(7,6,5,4));
        x.add(7);
        int[] n=new int[y.size()];
        Arrays.setAll(n, y::get);
        for(int i:n)
            System.out.print(i+" ");
//        return arr;
//        return new ArrayList<>(set.values());



//        HashMap<Integer,Integer> arr=new HashMap<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            if(arr.containsKey(nums[i]))
//                arr.put(nums[i],arr.get(nums[i])+1);
//            else
//                arr.put(nums[i],1);
//        }
//        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
//            (x,y)->y.getValue()-x.getValue()
//        );
//        for(Map.Entry<Integer,Integer> it:arr.entrySet())
//        {
//            pq.add(it);
//        }
//        int a[]=new int[k];
//        int i=0;
//        System.out.println(pq);
//        while(i<k&&!pq.isEmpty())
//        {
//            a[i++]=pq.poll().getKey();
//        }
    }
}
