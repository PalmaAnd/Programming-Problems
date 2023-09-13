package problems.leetcode.utils;

// Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.val);
        ListNode current = this.next;
        while (current != null) {
            builder.append(" -> ").append(current.val);
            current = current.next;
        }

        return builder.toString();
    }

}
