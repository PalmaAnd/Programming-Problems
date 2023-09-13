package problems.leetcode.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MinValueNodeTest {

    @Test
    void testNodeCreation() {
        MinValueNode node = new MinValueNode(5, null, 5);
        assertEquals(5, node.val);
        assertEquals(5, node.minValue);
        assertNull(node.parent);
        assertNull(node.next);
    }

    @Test
    void testNodeWithParent() {
        MinValueNode parent = new MinValueNode(5, null, 5);
        MinValueNode node = new MinValueNode(3, parent, 3);
        assertEquals(3, node.val);
        assertEquals(3, node.minValue);
        assertEquals(parent, node.parent);
        assertNull(node.next);
    }

    @Test
    void testNodeWithNext() {
        MinValueNode node1 = new MinValueNode(5, null, 5);
        MinValueNode node2 = new MinValueNode(3, null, 3);
        node1.next = node2;
        assertEquals(5, node1.val);
        assertEquals(5, node1.minValue);
        assertNull(node1.parent);
        assertEquals(node2, node1.next);
        assertEquals(3, node2.val);
        assertEquals(3, node2.minValue);
        assertNull(node2.parent);
        assertNull(node2.next);
    }
}
