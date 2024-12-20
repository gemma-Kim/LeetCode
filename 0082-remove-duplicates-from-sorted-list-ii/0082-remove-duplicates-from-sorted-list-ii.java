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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (head != null) {
            if ((head.next != null && head.val != head.next.val) || head.next == null) {
                node.next = new ListNode(head.val);
                node = node.next;
                
            } else {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
            }
            head = head.next;
        }
        return dummy.next;
    }
}