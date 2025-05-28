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

function levelOrderBottom(root: TreeNode | null): number[][] {
    if (!root) return [];
    const q = [];
    const result = [];
    result.push([root.val]);
    q.push(root);
    while (q.length) {
        const size = q.length;
        const val = [];
        console.log('size ', size)
        for (let i = 0; i < size; i++) {
            const current = q.shift();
            if (current.left) {
                q.push(current.left);
                val.push(current.left.val);
            }
            if (current.right) {
                q.push(current.right);
                val.push(current.right.val);
            }
            
        }
        if (val.length) {
            result.push(val);
        }
    }
    let reversedResult = [];
    for (let i = result.length-1; i >= 0; i--) {
        reversedResult.push(result[i]);
    }
    return reversedResult;
};