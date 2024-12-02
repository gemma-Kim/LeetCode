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
    fun hasCycle(head: ListNode?): Boolean {
        val set = HashSet<ListNode>()
        var h = head
        while (h != null) {
            if (set.contains(h)) return true
            set.add(h)
            h = h.next
        }
        return false
    }
}