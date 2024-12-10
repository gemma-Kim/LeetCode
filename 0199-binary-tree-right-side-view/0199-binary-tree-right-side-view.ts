/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function rightSideView(root: TreeNode | null): number[] {
    if (!root) return []
    let result = []
    let currents = [root]
    while (currents.length) {
        const size = currents.length
        for (let i = 0; i < size; i++) {
            const node = currents.shift()
            if (i == size-1) result.push(node.val)
            if (node.left) currents.push(node.left)
            if (node.right) currents.push(node.right)
        }
    }
    return result
};