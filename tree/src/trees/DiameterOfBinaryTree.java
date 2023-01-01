package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 13:43
 * @description 543. 二叉树的直径
 * https://leetcode.cn/problems/diameter-of-binary-tree/description/
 */
public class DiameterOfBinaryTree {
    // 记录最大直径的长度
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        // 对每个节点计算直径，求最大直径
        traverse(root);
        return maxDiameter;
    }

    // 遍历二叉树
    void traverse(TreeNode root) {

        if (root == null) { return;}

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // 计算最大直径
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        traverse(root.left);
        traverse(root.right);
    }

    // 计算二叉树的最大深度
    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
