package problems.leetcode.linked_list;

import problems.leetcode.utils.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode answer = null;
        // Loop until the original list is completely processed
        while (head != null) {
            ListNode nextTemp = head.next;
            // Reverse next pointer so it point to the previous one
            head.next = answer;
            // Set 'answer' to the current node, making it the new head of the reversed list
            answer = head;
            head = nextTemp;
        }
        return answer;
    }
}
