package problems.leetcode.arrays_hashing;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramsTest {

    private GroupAnagrams solution;

    @BeforeEach
    public void setUp() {
        solution = new GroupAnagrams();
    }

    // Helper method to compare the lists but ignoring the order
    private void customAssertSetEquals(List<List<String>> expected, List<List<String>> actual) {
        Set<Set<String>> expectedSet = new HashSet<>();
        for (List<String> list : expected) {
            expectedSet.add(new HashSet<>(list));
        }

        Set<Set<String>> actualSet = new HashSet<>();
        for (List<String> list : actual) {
            actualSet.add(new HashSet<>(list));
        }

        assertEquals(expectedSet, actualSet);
    }

    @Test
    public void testGroupAnagramsEmptyInput() {
        // Test case: An empty array should return an empty list
        String[] input = {};
        List<List<String>> result = solution.groupAnagrams(input);
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void testGroupAnagramsNoAnagrams() {
        // Test case: An array with no anagrams
        String[] input = {"abc", "def", "xyz"};
        List<List<String>> result = solution.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("abc"),
                Arrays.asList("def"),
                Arrays.asList("xyz")
        );
        customAssertSetEquals(expected, result);
    }

    @Test
    public void testGroupAnagramsMultipleAnagrams() {
        // Test case: An array with multiple anagrams
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                Arrays.asList("bat")
        );
        customAssertSetEquals(expected, result);
    }

    @Test
    public void testGroupAnagramsAllAnagrams() {
        // Test case: All input strings are anagrams of each other
        String[] input = {"listen", "silent", "enlist"};
        List<List<String>> result = solution.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("listen", "silent", "enlist")
        );
        customAssertSetEquals(expected, result);
    }

    @Test
    public void testGroupAnagramsSingleInput() {
        // Test case: Single input string
        String[] input = {"word"};
        List<List<String>> result = solution.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("word")
        );
        customAssertSetEquals(expected, result);
    }
}
