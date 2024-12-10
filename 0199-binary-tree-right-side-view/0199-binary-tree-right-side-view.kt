/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        if (root == null) return result
        val currents = mutableListOf<TreeNode>()
        currents.add(root)
        while (currents.isNotEmpty()) {
            val size = currents.size
            for (i in 0..size-1) {
                val node = currents.removeAt(0)
                if (i == size - 1) {
                    result.add(node.`val`)
                }
                if (node.left != null) currents.add(node.left)
                if (node.right != null) currents.add(node.right)
            }
        }
        return result
    }
}