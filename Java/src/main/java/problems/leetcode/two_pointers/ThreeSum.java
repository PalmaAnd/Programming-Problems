package problems.leetcode.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0; // the integer we want to get by addition of 3 entries
        List<List<Integer>> answer = new ArrayList<>();
        int listSize = nums.length;
        for (int i = 0; i < listSize; i++){
            for (int j = i + 1; j < listSize; j++) {
                for (int k = j + 1; k < listSize; k++) {
                    if (nums[i] + nums[j] + nums[k] == target){
                        List<Integer> newEntry = new ArrayList<>();
                        if (nums[i] < nums[j]){
                            if (nums[i] < nums[k]){
                                newEntry.add(nums[i]);
                                newEntry.add(Math.min(nums[j], nums[k]));
                                newEntry.add(Math.max(nums[j], nums[k]));
                            } else if (nums[i] < nums[j]){
                                newEntry.add(nums[k]);
                                newEntry.add(nums[i]);
                                newEntry.add(nums[j]);
                            } else {
                                newEntry.add(nums[k]);
                                newEntry.add(nums[j]);
                                newEntry.add(nums[i]);
                            }
                        } else if (nums[j] < nums[k]){
                            newEntry.add(nums[j]);
                            newEntry.add(Math.min(nums[i], nums[k]));
                            newEntry.add(Math.max(nums[i], nums[k]));
                        } else {
                            newEntry.add(nums[k]);
                            newEntry.add(Math.min(nums[i], nums[j]));
                            newEntry.add(Math.max(nums[i], nums[j]));
                        }
                        if (!answer.contains(newEntry))
                            answer.add(newEntry);
                    }
                }

            }
        }
        return answer;
    }
}
