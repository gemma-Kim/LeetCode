# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def is_mirror(self, node1, node2):
        if node1 and node2:
            if node1.val != node2.val:
                return False
            first_condition = self.is_mirror(node1.left, node2.right)
            second_condition = self.is_mirror(node1.right, node2.left)
            return True if first_condition and second_condition else False
        elif not node1 and not node2:
            return True
        else:
            return False

    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        return self.is_mirror(root.left, root.right)