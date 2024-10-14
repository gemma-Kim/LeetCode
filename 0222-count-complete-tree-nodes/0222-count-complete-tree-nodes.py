# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def countNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        result = 1
        result += self.countNodes(root.left)
        result += self.countNodes(root.right)
        # result += left_cnt
        # result += right_cnt
        return result
        