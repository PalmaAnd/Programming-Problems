package problems.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void testMinStack() {
        MinStack minStack = new MinStack();

        // Test case 1: Push and pop elements
        minStack.push(5);
        minStack.push(2);
        minStack.push(7);
        minStack.pop();
        assertEquals(2, minStack.top());
        assertEquals(2, minStack.getMin());

        // Test case 2: Push and pop elements, check minimum
        minStack.push(1);
        minStack.push(3);
        minStack.pop();
        assertEquals(1, minStack.top());
        assertEquals(1, minStack.getMin());

        // Test case 3: Push and pop elements, check minimum
        minStack.pop();
        assertEquals(2, minStack.top());
        assertEquals(2, minStack.getMin());


        // Test case 4: Push multiple elements with the same value
        minStack.push(2);
        minStack.push(2);
        assertEquals(2, minStack.top());
        assertEquals(2, minStack.getMin());

        // Test case 5: Pop all elements
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        assertTrue(minStack.isEmpty());
    }
}
