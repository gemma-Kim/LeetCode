/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    if (!head || !head.next) return false;
    let slow = head;
    let fast = head.next;
    while (slow !== fast) {
        if (!slow || !fast || !slow.next || !fast.next) return false;
        slow = slow.next;
        fast = fast.next.next;
    }
    return true;
};