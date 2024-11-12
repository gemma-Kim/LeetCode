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
        // bfs
        // queue 로 동작
        // 재귀적 동작이 아님
        
        List<Integer> result = new ArrayList();
        if (root == null) return result;
        Queue<TreeNode> nodes = new LinkedList();

        nodes.add(root);
        while (!nodes.isEmpty()) {
            int queueSize = nodes.size();
            TreeNode rightMostNode = null;

            for (int i = 0; i < queueSize; i++) {
                TreeNode node = nodes.poll();
                rightMostNode = node;
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
            
            result.add(rightMostNode.val);
        }
        return result;
    }
}