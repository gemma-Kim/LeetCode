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
    private Queue q = new LinkedList();
    private List<Integer> result = new ArrayList();
    
    private void dfs(TreeNode node) {
        if (node != null) {
            dfs(node.left);
            result.add(node.val);
            dfs(node.right);
            return;
        }
        return;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        dfs(root);
        return result;
    }
}