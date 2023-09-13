package problems.leetcode.utils;

import org.junit.jupiter.api.Test;
import problems.leetcode.linked_list.ReverseLinkedList;

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

        // Convert the reversed list to a string for testing
        String reversedListString = revHead.toString();

        // Assert that the reversed list matches the expected result
        assertEquals("5 -> 4 -> 3 -> 2 -> 1", reversedListString);
    }
}
