package problems.leetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductExceptSelfTest {

    @Test
    void testSampleInput() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = productExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testAllOnes() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        int[] result = productExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testEmptyInput() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {};
        int[] expected = {};
        int[] result = productExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSingleElement() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {5};
        int[] expected = {1};
        int[] result = productExceptSelf.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }
}
