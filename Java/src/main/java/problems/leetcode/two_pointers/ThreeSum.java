package problems.leetcode.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0; // the integer we want to get by addition of 3 entries
        List<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> sortedList = sortList(nums);
        int listSize = sortedList.size();
        for (int i = 0; i < listSize; i++){
            for (int j = i + 1; j < listSize; j++) {
                for (int k = j + 1; k < listSize; k++) {
                    if (sortedList.get(i) + sortedList.get(j) + sortedList.get(k) == target){
                        List<Integer> newEntry = new ArrayList<>();
                        newEntry.add(nums[i]);
                        newEntry.add(nums[j]);
                        newEntry.add(nums[k]);
                        answer.add(newEntry);
                    }
                }

            }
        }
        return answer;
    }

    public ArrayList<Integer> sortList(int[] list){
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(list[0]);
        // Create and fill sorted list
        for (int i = 1; i < list.length - 2; i++) {
            int j = 0;
            int currentVal = list[i];
            while(j < sortedList.size() && currentVal < sortedList.get(j)){
                if (currentVal < sortedList.get(j)){
                    sortedList.add(j, currentVal);
                    break;
                }
                j++;
            }
        }
        return sortedList;
    }
}
