/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        return 1;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        /* maxDepth(node)=1+max(maxDepth(node.left),maxDepth(node.right)) */
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}