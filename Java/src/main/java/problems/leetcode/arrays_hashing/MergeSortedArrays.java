package problems.leetcode.arrays_hashing;

public class MergeSortedArrays {

    /**
     * The final sorted array should not be returned by the function,
     * but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n, where the first m elements denote the
     * elements that should be merged, and the last n elements are set to 0
     * and should be ignored. nums2 has a length of n.
     *
     * @param nums1 the first sorted array with nums1.length - n - 1 space at the end for merged elements
     * @param m the number of elements in nums1
     * @param nums2 the second sorted array
     * @param n the number of elements in nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int mergedArrIndex = nums1.length - 1;

        /*
         * The idea is to fill nums1 from the back to the front by comparing
         * the biggest remaining elements in nums1 and nums2
        */
        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[mergedArrIndex] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[mergedArrIndex] = nums2[nums2Index];
                nums2Index--;
            }
            mergedArrIndex--;
        }

        // If there are still elements in nums2 place them at the remaining spots of nums1
        while (nums2Index >= 0) {
            nums1[mergedArrIndex] = nums2[nums2Index];
            nums2Index--;
            mergedArrIndex--;
        }
    }
}