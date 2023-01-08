package trees;

/**
 * @author hallo
 * @datetime 2023-01-08 22:53
 * @description 110. 平衡二叉树
 * <a href="https://leetcode.cn/problems/balanced-binary-tree/description/">...</a>
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int i = getHeight(root);
        return !(i < 0);
    }

    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left_height = getHeight(node.left);
        if (left_height == -1) {
            return -1;
        }
        int right_height = getHeight(node.right);
        if (right_height == -1 || Math.abs(left_height - right_height) > 1) {
            return -1;
        }
        return Math.max(left_height, right_height) + 1;
    }
}
