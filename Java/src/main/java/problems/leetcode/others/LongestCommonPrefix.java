package problems.leetcode.others;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int length = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());
        }
        for (int j = 0; j < length; j++) {
            char sol = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (sol != strs[i].charAt(j)) return prefix;
            }
            prefix += sol;
        }
        return prefix;
    }
}