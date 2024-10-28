# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        
        if not head:
            return
        if not k:
            return head
        orgin_head = head
        node_values = []
        while head:
            node_values.append(head.val)
            head = head.next
        k = k % len(node_values) if len(node_values) < k else k
        if not k:
            return orgin_head
        node_values = node_values[-k:] + node_values[:len(node_values)-k]
        dummy_head = ListNode(0)
        result = dummy_head
        for value in node_values:
            result.next = ListNode(value)
            result = result.next
        return dummy_head.next
        