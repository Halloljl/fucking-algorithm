package trees;

/**
 * @author hallo
 * @datetime 2023-01-14 10:54
 * @description 530. 二叉搜索树的最小绝对差    783. 二叉搜索树节点最小距离
 * <a href="https://leetcode.cn/problems/minimum-absolute-difference-in-bst/description/">...</a>
 *  <a href="https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/">...</a>
 */
public class MinimumAbsoluteDifferenceInBst {
    // 遍历二叉树得到结果
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return ans;
    }

    TreeNode pre = null;
    int ans = Integer.MAX_VALUE;
    void traverse(TreeNode root) {
        if (root == null) { return;}

        traverse(root.left);
        if (pre != null) {
            ans = Math.min(ans, root.val - pre.val);
        }
        pre = root;
        traverse(root.right);
    }
}
