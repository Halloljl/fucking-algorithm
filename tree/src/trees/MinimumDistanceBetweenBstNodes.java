package trees;

/**
 * @author hallo
 * @datetime 2023-01-13 23:02
 * @description 783. 二叉搜索树节点最小距离
 * <a href="https://leetcode.cn/problems/minimum-distance-between-bst-nodes/">...</a>
 */
public class MinimumDistanceBetweenBstNodes {
    public int minDiffInBST(TreeNode root) {
        traverse(root);
        return distance;
    }

    TreeNode pre = null;
    int distance = Integer.MAX_VALUE;
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        if (pre != null) {
            distance = Math.min(distance, root.val - pre.val);
        }
        pre = root;
        traverse(root.right);
    }
}
