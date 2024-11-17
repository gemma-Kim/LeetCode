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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // bfs breath first search
        // this is not 재귀 (recursive function)
        // left -> right -> left -> right
        // level order must be changed like zigzag
        List<List<Integer>> result = new ArrayList();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList();
        String order = "left"; // left or right
        
        q.add(root);

        while (!q.isEmpty()) { // process while loop until q is not empty
            // check size of q presently
            int size = q.size();
            List<Integer> values = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                values.add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (order.equals("left")) {
                result.add(values);
            } else {
                Collections.reverse(values);
                result.add(values);
            }

            if (order.equals("left")) { 
                order = "right"; 
            } else { 
                order = "left"; 
            }
        }

        return result;

    }
}