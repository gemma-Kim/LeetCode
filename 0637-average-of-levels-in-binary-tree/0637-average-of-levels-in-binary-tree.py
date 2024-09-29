# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        result = []
        queue = []
        if root:
            queue.append(root)
        while queue:
            current_sum = 0
            queue_len = len(queue) 
            for i in range(queue_len):
                node = queue.pop(0)
                current_sum += node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            result.append(current_sum / float(queue_len))
        return result
        