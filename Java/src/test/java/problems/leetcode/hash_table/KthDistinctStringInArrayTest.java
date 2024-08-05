package problems.leetcode.hash_table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthDistinctStringInArrayTest {

    @Test
    void testSimple() {
        KthDistinctStringInArray kthDistinctStringInArray = new KthDistinctStringInArray();
        String[] input = {"d", "b", "c", "b", "c", "a"};
        String result = kthDistinctStringInArray.kthDistinct(input, 2);
        assertEquals("a", result);
    }

    @Test
    void testMultipleSymbols() {
        KthDistinctStringInArray kthDistinctStringInArray = new KthDistinctStringInArray();
        String[] input = {"aaa", "aa", "a"};
        String result = kthDistinctStringInArray.kthDistinct(input, 1);
        assertEquals("aaa", result);
    }

    @Test
    void testComplexString() {
        KthDistinctStringInArray kthDistinctStringInArray = new KthDistinctStringInArray();
        String[] input = {"a", "b", "a"};
        String result = kthDistinctStringInArray.kthDistinct(input, 3);
        assertEquals("", result);
    }
}
