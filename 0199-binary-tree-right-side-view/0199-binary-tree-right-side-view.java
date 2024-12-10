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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();
        if (root == null) return result;
        List<TreeNode> currents = new ArrayList();
        currents.add(root);
        while(currents.size() > 0) {
            int size = currents.size();
            Integer rightSideVal = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = currents.remove(0);
                if (node.left != null) currents.add(node.left);
                if (node.right != null) currents.add(node.right);
                rightSideVal = node.val;
            }
            result.add(rightSideVal);
        }
        return result;
    }

}