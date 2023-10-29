package problems.leetcode.arrays_hashing;

public class MergeSortedArrays {

    /**
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n, where the first m elements denote the
     * elements that should be merged, and the last n elements are set to 0
     * and should be ignored. nums2 has a length of n.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]){
                    moveArray(nums1, i, m);
                    nums1[i] = nums2[j];
                }
            }
        }
    }

    private void moveArray(int[] nums1, int i, int size){
        int val = nums1[i];
        while (i < size - 1){
            int help = nums1[i + 1];
            nums1[i + 1] = val;
            val = help;
            i++;
        }
    }
}
