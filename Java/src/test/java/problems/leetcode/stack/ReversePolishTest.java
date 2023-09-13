package problems.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishTest {

    @Test
    void testEvalRPN() {
        ReversePolish reversePolish = new ReversePolish();

        // Test case 1: Sample input
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        int result1 = reversePolish.evalRPN(tokens1);
        assertEquals(9, result1);

        // Test case 2: More complex expression
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        int result2 = reversePolish.evalRPN(tokens2);
        assertEquals(6, result2);

        // Test case 3: Division by zero
        String[] tokens3 = {"3", "0", "/"};
        int result3 = reversePolish.evalRPN(tokens3);
        assertEquals(0, result3);

    }
}
