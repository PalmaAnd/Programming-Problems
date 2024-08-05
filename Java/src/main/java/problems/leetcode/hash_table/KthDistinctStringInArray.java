package problems.leetcode.hash_table;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringInArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s : arr) {
            if (!map.containsKey(s))
                map.put(s, true);
            else
                map.put(s, false);
        }
        for (String s : arr) {
            if (map.get(s)) {
                k--;
                if (k == 0) return s;
            }
        }
        return "";
    }
}
