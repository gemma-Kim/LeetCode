# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not head:
            return 
        values = []
        while head:            
            values.append(head.val)
            head = head.next

        counts = Counter(values)
        for key in Counter(values):
            if counts[key] != 1:
                del counts[key]

        result_head = ListNode(-101)
        result = result_head
        for value in sorted(counts):
            result.next = ListNode(value) 
            result = result.next           
        return result_head.next  