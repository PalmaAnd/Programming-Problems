package problems.leetcode.hash_table;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0, previous = 0, current = 0;
        char[] chars = s.toCharArray();
        for (char romanChar : chars) {
            switch (romanChar) {
                case 'I' -> current = 1;
                case 'V' -> current = 5;
                case 'X' -> current = 10;
                case 'L' -> current = 50;
                case 'C' -> current = 100;
                case 'D' -> current = 500;
                case 'M' -> current = 1000;
            }
            if (previous < current)
                // because we add previous once before and need to remove that
                result += current - 2 * previous;
            else
                result += current;
            previous = current;
        }
        return result;
    }
}
