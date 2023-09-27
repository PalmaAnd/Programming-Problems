package problems.leetcode.arrays_hashing;

import java.util.*;

/**
 * This class provides a method for grouping anagrams from an array of strings.
 */
public class GroupAnagrams {

    /**
     * Groups anagrams from an array of strings.
     *
     * An anagram is a word or phrase formed by rearranging the letters of another.
     * This method takes an array of strings and groups them into lists where each list
     * contains words that are anagrams of each other.
     *
     * @param strs An array of input strings to group into anagrams.
     * @return A list of lists, where each inner list contains anagrams of each other.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>(); // Return an empty list if there are no input strings

        // Create a map to store sorted strings as keys and their corresponding anagrams as values
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert the string to a character array to sort it and set it back as a new string
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);

            // If the sorted string is not in the map, create a new list for it
            if (!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<>());

            // Add the original string to the list of anagrams for the sorted string
            map.get(sortedString).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

