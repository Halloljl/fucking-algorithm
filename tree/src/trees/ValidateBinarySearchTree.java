package trees;

/**
 * @author hallo
 * @datetime 2023-01-13 22:40
 * @description 98. 验证二叉搜索树
 * <a href="https://leetcode.cn/problems/validate-binary-search-tree/description/">...</a>
 */
public class ValidateBinarySearchTree {
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (root == null) { return true;}
        boolean isVLeft = isValidBST(root.left);
        if (pre != null && pre.val >= root.val) {
            return false;
        } else {
            pre = root;
        }
        boolean isVRight = isValidBST(root.right);
        return isVLeft && isVRight;
    }
}
