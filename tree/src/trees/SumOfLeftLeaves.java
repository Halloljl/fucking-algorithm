package trees;

/**
 * @author hallo
 * @datetime 2023-01-10 13:02
 * @description 404. 左叶子之和
 * <a href="https://leetcode.cn/problems/sum-of-left-leaves/description/">...</a>
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        // 边界条件
        if (root == null) {
            return 0;
        }
        // 此时是到达叶子节点
        if (root.left == null && root.right == null) {
            return 0;
        }

        int lSum = sumOfLeftLeaves(root.left);
        // 此时是到达叶子节点的父节点
        if (root.left != null && root.left.left == null && root.left.right == null) {
            lSum = root.left.val;
        }
        int rSum = sumOfLeftLeaves(root.right);

        return lSum + rSum;
    }
}
