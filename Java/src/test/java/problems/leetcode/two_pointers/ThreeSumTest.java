package problems.leetcode.two_pointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {

    @Test
    void testThreeSum_SampleInput() {
        ThreeSum threeSum = new ThreeSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertEquals(2, result.size());
        assertEquals(List.of(-1, -1, 2), result.get(0));
        assertEquals(List.of(-1, 0, 1), result.get(1));
    }

    @Test
    void testThreeSum_NoValidTriplets() {
        ThreeSum threeSum = new ThreeSum();

        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertEquals(0, result.size());
    }

    @Test
    void testThreeSum_EmptyInput() {
        ThreeSum threeSum = new ThreeSum();

        int[] nums = {};
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertEquals(0, result.size());
    }

    @Test
    void testThreeSum_AllZeros() {
        ThreeSum threeSum = new ThreeSum();

        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertEquals(1, result.size());
        assertEquals(List.of(0, 0, 0), result.get(0));
    }
}
