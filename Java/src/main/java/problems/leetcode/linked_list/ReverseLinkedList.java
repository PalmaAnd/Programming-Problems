package problems.leetcode.linked_list;


import problems.leetcode.utils.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode answer = new ListNode();
        while(head.next != null){
            ListNode temp = answer;
            answer = head.next;
            answer.next = temp;
            head = head.next;
        }
        answer.next = head;
        return answer;
    }
}
