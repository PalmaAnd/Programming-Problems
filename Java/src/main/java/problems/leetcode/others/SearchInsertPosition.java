package problems.leetcode.others;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target) return pos;
            pos++;
        }
        return nums.length;
    }
}
