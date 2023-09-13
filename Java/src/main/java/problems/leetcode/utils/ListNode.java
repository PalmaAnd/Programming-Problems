package problems.leetcode.utils;

// Definition for singly-linked list.
public class ListNode {
    int val;
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
       String ret = String.valueOf(this.val);
        while(this.next != null){
            System.out.println("toString thigns");
            System.out.println(this.next);
            ret +=  " -> " + this.next.val;
            this.next = this.next.next;
        }
       return ret;
    }
}
