package problems.leetcode.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        ArrayList<Integer> sortedList = sortList(nums);
        for (int i = 0; i < sortedList.size(); i++){

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
