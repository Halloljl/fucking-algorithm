package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 12:50
 * @description 104. 二叉树的最大深度
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
    // 先用遍历的思想来解决问题
    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    // 首先声明一个总深度
    int res = 0;
    // 维护的一个深度
    int depth = 0;

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 在前序遍历的位置 维护深度 进入里面了应该是depth++
        depth++;

        if (root.left == null && root.right == null) {
            // 现在就是达到了叶子节点了 更新最大深度
            res = Math.max(res, depth);
        }
        traverse(root.left);
        traverse(root.right);

        // 在后序遍历的位置
        depth--;
    }
}
