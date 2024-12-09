/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(0);
        var node = dummy
        var node1 = list1;
        var node2 = list2;
        while (node1 != null && node2 != null) {
            if (node1.`val` < node2.`val`) {
                node.next = node1
                node1 = node1.next
            } else {
                node.next = node2
                node2 = node2.next
            }
            node = node.next!!
        }

        node.next = node1 ?: node2

        return dummy.next;
    }
}