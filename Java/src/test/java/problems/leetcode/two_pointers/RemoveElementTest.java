package problems.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    RemoveElement r = new RemoveElement();

    @Test
    public void testSimple() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        assertEquals(2, r.removeElement(nums, val));
    }
    @Test
    public void testComplex() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        assertEquals(5, r.removeElement(nums, val));
    }
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int val = 3;
        assertEquals(0, r.removeElement(nums, val));
    }
    @Test
    public void testNonExistingVal() {
        int[] nums = {2};
        int val = 3;
        assertEquals(1, r.removeElement(nums, val));
    }

}
