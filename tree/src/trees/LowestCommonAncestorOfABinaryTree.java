package trees;

/**
 * @author hallo
 * @datetime 2023-01-15 23:36
 * @description 236. 二叉树的最近公共祖先
 * <a href="https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/description/">...</a>
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 边界条件 遍历到底了
        if (root == null) {
            return null;
        }
        /** 在前序位置就可以写 以为判断的是当前值 */
        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        /** 后续遍历的位置 现在已经有左右递归返回的值 */
        // 情况是左右都有值返回 那么lowestCommonAncestor就是root
        if (left != null && right != null) {return root;}
        // 两个都为空 那就一路向上返回null
        if (left == null && right == null) {return null;}
        // 否则 就是左为空右不为空 或者 右为空左不为空 返回有值的一方
        else {return left == null ? right : left;}
    }
}
