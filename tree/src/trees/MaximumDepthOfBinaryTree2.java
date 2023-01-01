package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 12:50
 * @description 104. 二叉树的最大深度
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree2 {
    // 用分治思想来解决问题
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 得到左子树的最大深度
        int leftDepth = maxDepth(root.left);
        // 得到右子树的最大深度
        int rightDepth = maxDepth(root.right);
        // 取最大值，然后加上本层深度 +1
        int res = Math.max(leftDepth, rightDepth) + 1;
        return res;
    }
}
