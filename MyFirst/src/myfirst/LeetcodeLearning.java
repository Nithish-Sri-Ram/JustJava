package myfirst;

import java.util.*;

/**
 * This class demonstrates usage of various Java Collections and common practices used in problem-solving.
 *
 * @author nithish
 */
public class LeetcodeLearning {
    public static void main(String[] args) {
        // HashSet demonstration
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        // HashMap demonstration
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 3);
        hm.put(2, 3);
        hm.put(3, 1);

        // Iterate and remove entries with a value less than 2
        Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() < 2) {
                iterator.remove();  // Use iterator's remove method to avoid ConcurrentModificationException
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Size of HashMap after removal: " + hm.size());

        // ArrayList of Lists demonstration
        ArrayList<List<String>> arr = new ArrayList<>();
        ArrayList<String> subArr = new ArrayList<>();
        String a = "apple";
        String b = "banana";
        subArr.add(a);
        subArr.add(b);
        arr.add(subArr);

        // Convert List to Array
        List<Integer> x = new ArrayList<>(List.of(7, 6, 5, 4));
        List<Integer> y = new ArrayList<>(Arrays.asList(7, 6, 5, 4));
        x.add(7);
        int[] n = new int[y.size()];
        Arrays.setAll(n, y::get);
        
        // Print the array
        for (int i : n) {
            System.out.print(i + " ");
        }
        System.out.println();

        // PriorityQueue demonstration (Example use-case for LeetCode-style problems)
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (x1, y1) -> y1.getValue() - x1.getValue()  // Max-heap based on frequency
        );
        pq.addAll(freqMap.entrySet());

        int[] topK = new int[k];
        int i = 0;
        while (i < k && !pq.isEmpty()) {
            topK[i++] = pq.poll().getKey();
        }

        // Print top k frequent elements
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topK));
    }
}
