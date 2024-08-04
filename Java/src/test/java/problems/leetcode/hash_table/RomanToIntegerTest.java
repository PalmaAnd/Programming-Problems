package problems.leetcode.hash_table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void testSimple() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "III";
        int result = romanToInteger.romanToInt(input);
        assertEquals(3, result);
    }

    @Test
    void testMultipleSymbols() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "MDCLXVI";
        int result = romanToInteger.romanToInt(input);
        assertEquals(1666, result);
    }

    @Test
    void testComplexString() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "MCMXCIV";
        int result = romanToInteger.romanToInt(input);
        assertEquals(1994, result);
    }
}
