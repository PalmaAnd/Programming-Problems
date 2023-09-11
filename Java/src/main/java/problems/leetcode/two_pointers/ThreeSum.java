package problems.leetcode.two_pointers;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0; // the integer we want to get by addition of 3 entries
        Arrays.sort(nums);
        Set<List<Integer>> helperSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            // Create the "two pointers", one at the end, and the other one starting from the start
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target){
                    helperSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(helperSet);
    }
}
