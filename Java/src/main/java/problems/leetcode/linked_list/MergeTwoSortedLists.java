package problems.leetcode.linked_list;

import problems.leetcode.utils.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val){
            sortedList = list1;
            list1 = list1.next;
        } else {
            sortedList = list2;
            list2 = list2.next;
        }
        sortedList.next = mergeTwoLists(list1, list2);
        return sortedList;
    }
}
