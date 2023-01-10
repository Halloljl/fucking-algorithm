package trees;

/**
 * @author hallo
 * @datetime 2023-01-10 0:12
 * @description
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 得到左子树的最小深度
        int leftDepth = minDepth(root.left);
        // 得到右子树的最小深度
        int rightDepth = minDepth(root.right);
        /** 后序遍历的位置 */
        int res;
        // 分析情况 左子树为空，右子树不为空? or 左... 右...?
        if (root.left == null && root.right != null) { res = rightDepth + 1;}
        else if (root.left != null && root.right == null) { res = leftDepth + 1;}
        else { res = Math.min(leftDepth, rightDepth) + 1;}
        return res;
    }
}
