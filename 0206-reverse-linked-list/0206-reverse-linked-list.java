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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        List<Integer> values_arr = new ArrayList(); // define mutable list
        while (head != null) {
            // save value in values_arr
            values_arr.add(head.val);
            // update head
            head = head.next;
        }

        // loop all values in values_arr from end index to start index
        // becasue we need to reverse all values
        ListNode dummy = new ListNode(1);
        ListNode result_node = dummy; // result ListNode
        for (int i = values_arr.size()-1; i >= 0; i--) {
            // define next node of 
            result_node.next = new ListNode(values_arr.get(i));
            result_node = result_node.next;
        }
        return dummy.next;
    }
}