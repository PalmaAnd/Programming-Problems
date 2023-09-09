package problems.leetcode.arrays_hashing;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int arrayLength = nums.length;
        int[] answer = new int[arrayLength];
        int[] prefix = new int[arrayLength];
        int[] suffix = new int[arrayLength];
        prefix[0] = 1; // The first element does not have a prefix, so we set it neutral (1 for multiplications)
        suffix[arrayLength-1] = 1; // Same goes for the last element as it does not have a suffix
        for (int i = 1; i < arrayLength; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
            suffix[arrayLength - i - 1] = nums[arrayLength - i] * suffix[arrayLength - i];
        }
        for (int i = 0; i < arrayLength; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }

    public int[] productExceptSelfBruteForce(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    answer[i] *= nums[j];
            }
        }
        return answer;
    }
}
