package problems.leetcode.arrays_hashing;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str:strs) {
            char[] sortedStr = str.toCharArray();
            Arrays.sort(sortedStr);
            String sortedString = String.valueOf(sortedStr);
            if (map.containsValue(sortedStr)){

            }

        }

        return null;
    }
}
