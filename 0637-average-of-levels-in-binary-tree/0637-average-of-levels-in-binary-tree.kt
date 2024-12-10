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
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val result = ArrayList<Double>()
        val currentNodes = mutableListOf<TreeNode>()
        if (root != null) currentNodes.add(root)
        while (!currentNodes.isEmpty()) {
            val size = currentNodes.size
            var sum = 0L
            for (i in 0..size-1) {
                val node = currentNodes.removeAt(0)
                if (node.left != null) currentNodes.add(node.left)
                if (node.right != null) currentNodes.add(node.right)
                sum += node.`val`
            }
            result.add(sum.toDouble() / size)
        }
        return result.toDoubleArray()
    }
}