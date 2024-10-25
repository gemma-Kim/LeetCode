# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def kthSmallest(self, root, k):
        """
        :type root: Optional[TreeNode]
        :type k: int
        :rtype: int
        """
        
        def dfs(node, l):
            if not node:
                return
            l.append(node.val)
            dfs(node.left, l)
            dfs(node.right, l)
            return l
        stacked = dfs(root, [])
        sorted_stacked = sorted(stacked)
        return sorted_stacked[k-1]