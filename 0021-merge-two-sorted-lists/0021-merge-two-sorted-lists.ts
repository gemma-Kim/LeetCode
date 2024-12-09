/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function mergeTwoLists(list1: ListNode | null, list2: ListNode | null): ListNode | null {
    const dummy = new ListNode(0)
    let node = dummy
    while (list1 && list2) {
        if (list1.val < list2.val) {
            node.next = new ListNode(list1.val)
            list1 = list1.next
        } else {
            node.next = new ListNode(list2.val)
            list2 = list2.next
        }
        node = node.next
    }

    node.next = list1 ?? list2

    return dummy.next
};