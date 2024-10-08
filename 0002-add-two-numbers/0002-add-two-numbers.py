# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1 and not l2:
            return None

        current_val = 0
        if l1:
            current_val += l1.val
        if l2:
            current_val += l2.val
        next_val = 1 if current_val >= 10 else 0
        if current_val >= 10:
            current_val -= 10
            if l1.next:
                l1.next.val = l1.next.val + 1
            elif l2.next:
                l2.next.val = l2.next.val + 1
            
        current_node = ListNode(current_val)
        
        if l1.next and l2.next:              
            next_node = self.addTwoNumbers(l1.next, l2.next)
            current_node.next = next_node
        elif l1.next and not l2.next:              
            next_node = self.addTwoNumbers(l1.next,ListNode(0))
            current_node.next = next_node
        elif not l1.next and l2.next:              
            next_node = self.addTwoNumbers(ListNode(0), l2.next)
            current_node.next = next_node
        else:
            if next_val == 1:
                current_node.next = ListNode(1)
            
        return current_node
        