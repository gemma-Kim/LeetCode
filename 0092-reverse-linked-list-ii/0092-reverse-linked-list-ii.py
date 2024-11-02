# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseBetween(self, head, left, right):
        """
        :type head: ListNode
        :type left: int
        :type right: int
        :rtype: ListNode
        """
        lefts = []
        middles = []
        rights = []
        cnt = 1
        while head:
            if cnt < left:
                lefts.append(head.val)
            elif cnt >= left and cnt <= right:
                middles.append(head.val)
            else:
                rights.append(head.val)
            head = head.next
            cnt += 1
        dummy = ListNode(0)
        result = dummy
        
        while lefts:
            val = lefts.pop(0)
            result.next = ListNode(val)
            result = result.next
        while middles:
            val = middles.pop()
            result.next = ListNode(val)
            result = result.next
        while rights:
            val = rights.pop(0)
            result.next = ListNode(val)
            result = result.next
        return dummy.next
        