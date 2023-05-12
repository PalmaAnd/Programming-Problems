/**
 * Problem: 147. Insertion Sort List
 * 
 * Definition for singly-linked list.
 */
 function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var insertionSortList = function (head) {
    let sortedHead = head.val;
    for (let index = 0; index < head.length; index++) {
        if (head) {
            
        }
        
    }
    return sortedHead;
};

module.exports = { insertionSortList };
