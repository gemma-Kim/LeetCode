# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p is None and q is None:
            return True
        elif p is None and q is not None:
            return False
        elif p is not None and q is None:
            return False

        left_val_is_same = self.isSameTree(p.left, q.left)
        right_val_is_same = self.isSameTree(p.right, q.right)

        return False if p.val != q.val or not left_val_is_same or not right_val_is_same else True
        
