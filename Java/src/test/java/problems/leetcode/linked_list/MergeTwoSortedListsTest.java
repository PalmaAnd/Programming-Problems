package problems.leetcode.linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problems.leetcode.utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists solution;

    @BeforeEach
    public void setUp() {
        solution = new MergeTwoSortedLists();
    }

    @Test
    public void testMergeTwoListsBothEmpty() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode merged = solution.mergeTwoLists(l1, l2);
        assertNull(merged);
    }

    @Test
    public void testMergeTwoListsWithOneEmpty() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        ListNode merged = solution.mergeTwoLists(l1, l2);
        assertEquals(l1, merged);

        l1 = null;
        l2 = new ListNode(2);
        merged = solution.mergeTwoLists(l1, l2);
        assertEquals(l2, merged);
    }

    @Test
    public void testMergeTwoListsBothNonEmpty() {
        // l1: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // l2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Expected merged list: 1 -> 1 -> 2 -> 3 -> 4 -> 4
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        ListNode merged = solution.mergeTwoLists(l1, l2);
        assertTrue(areListsEqual(expected, merged));
    }

    // Helper method to check if two linked lists are equal
    private boolean areListsEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }
}

