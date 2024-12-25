/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        current = dummy;
        while (head != null) {
            if (size == n) {
                current.next = head.next;
                head = head.next == null ? null : head.next.next;
                current = current.next;
            } else {
                current.next = head;
                head = head.next;
                current = current.next;
            }
            size--;
        }
        return dummy.next;
    }
}