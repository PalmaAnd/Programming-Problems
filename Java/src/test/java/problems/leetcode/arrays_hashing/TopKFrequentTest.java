package problems.leetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentTest {

    @Test
    void testSampleInput() {
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        int[] result = topKFrequent.topKFrequent(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    void testEmptyInput() {
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {};
        int k = 0;
        int[] expected = {};
        int[] result = topKFrequent.topKFrequent(nums, k);
        assertArrayEquals(expected, result);
    }
}
