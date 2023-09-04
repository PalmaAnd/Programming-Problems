package problems.leetcode.arrays_hashing;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent {
    /**
    * Given an integer array nums and an integer k, return the k most frequent elements.
    * You may return the answer in any order.
    * <p></p>
    * Details:<p></p>
    * - Runtime:       17ms    (Beats 75.1%)<p></p>
    * - Memory Usage:  47.59mb (Beats 74.24%)
     *
     * @param nums the given integer array
     * @param k    how many elements should be returned
     * @return the k most frequent elements
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] solution = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequencies of numbers using a HashMap
        for (int number : nums) {
            // If the number is already present in the map, increment its count, otherwise increment the default value 0
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        // Create a PriorityQueue (min-heap) with a custom comparator
        // The comparator compares numbers based on their frequencies
        Queue<Integer> queue = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        // Add all the keys (numbers) from the map to the queue
        queue.addAll(map.keySet());

        // Retrieve the top k frequent numbers from the queue
        for (int i = 0; i < k; i++) {
            solution[i] = queue.poll();
        }

        return solution;
    }

}
