package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 13:43
 * @description 543. 二叉树的直径
 * https://leetcode.cn/problems/diameter-of-binary-tree/description/
 */
public class DiameterOfBinaryTree2 {

    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // 对每个节点计算直径，求最大直径
        maxDepth(root);
        return maxDiameter;
    }

    // 计算二叉树的最大深度
    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // 后序位置
        // 计算直径
        int diameter = leftDepth + rightDepth;
        // 保存一下直径
        maxDiameter = Math.max(maxDiameter, leftDepth+ rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
