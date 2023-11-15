package problems.leetcode.arrays_hashing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArraysTest {

    @Test
    public void testMergeExample1() {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};
        mergeSortedArrays.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeExample2() {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        int[] nums1 = {1};
        int[] nums2 = {};
        int[] expected = {1};
        mergeSortedArrays.merge(nums1, 1, nums2, 0);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testMergeExample3() {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        int[] nums1 = {0};
        int[] nums2 = {1};
        int[] expected = {1};
        mergeSortedArrays.merge(nums1, 0, nums2, 1);
        assertArrayEquals(expected, nums1);
        System.out.println("Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.");
    }

    @Test
    public void testMergeCustom1() {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        int[] nums1 = {5, 6, 7, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int[] expected = {1, 2, 3, 5, 6, 7};
        mergeSortedArrays.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testEmptyArrays() {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();

        int[] nums1 = {};
        int[] nums2 = {};
        int[] expected = {};
        mergeSortedArrays.merge(nums1, 0, nums2, 0);
        assertArrayEquals(expected, nums2);
    }
}
