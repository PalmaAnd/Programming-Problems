package problems.leetcode.linked_list;

import org.junit.jupiter.api.Test;
import problems.leetcode.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @Test
    void testReverseList() {
        ReverseLinkedList revList = new ReverseLinkedList();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reverse the list
        ListNode revHead = revList.reverseList(head);

        // Assert that the reversed list is as expected: 5 -> 4 -> 3 -> 2 -> 1
        assertEquals(5, revHead.val);
        assertEquals(4, revHead.next.val);
        assertEquals(3, revHead.next.next.val);
        assertEquals(2, revHead.next.next.next.val);
        assertEquals(1, revHead.next.next.next.next.val);
    }
}
