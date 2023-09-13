package problems.leetcode.linked_list;

import problems.leetcode.utils.ListNode;

public class ReverseLinkedListTest {
    public static void main(String[] args) {
        ReverseLinkedList revList = new ReverseLinkedList();
        ListNode head = new ListNode(1);
        System.out.println(head.next);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(head);
        ListNode revHead = revList.reverseList(head);
        System.out.println(revHead);
    }

}
