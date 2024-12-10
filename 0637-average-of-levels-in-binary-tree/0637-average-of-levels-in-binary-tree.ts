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

function averageOfLevels(root: TreeNode | null): number[] {
    const result = []
    const currentNodes = [];
    if (root) currentNodes.push(root)
    while (currentNodes.length) {
        const size = currentNodes.length
        let sum = 0
        for (let i = 0; i < size; i++) {
            const node = currentNodes.shift()
            sum += node.val
            if (node.left) currentNodes.push(node.left)
            if (node.right) currentNodes.push(node.right)
        }
        result.push(sum / size)
    }
    return result
};