package trees;

/**
 * @author hallo
 * @datetime 2023-01-08 22:34
 * @description 101. 对称二叉树
 *  了解递归用法
 * <a href="https://leetcode.cn/problems/symmetric-tree/">...</a>
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left, root.right);
    }

    // 在【100. 相同的树】的基础上稍加改动
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 边界条件 如果一棵树为空了 那就没必要继续递归了 直接判断并返回
        if (p == null || q == null)
            return p == q;
        // 比较p q 树节点的值是否相等 并且递归比较左子树 递归比较右子树
        return p.val == q.val && isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }
}
