package trees;

/**
 * @author hallo
 * @datetime 2023-01-18 15:51
 * @description 669. 修剪二叉搜索树
 * <a href="https://leetcode.cn/problems/trim-a-binary-search-tree/">...</a>
 */
public class TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        // < low 此时root的左子树要去掉
        if (root.val < low) {
            // 虽然当前节点是小于low的，但是他的右子树可能还有非待删除的值 应该递归遍历右子树才是。
            return trimBST(root.right, low, high);
        }
        // > low 此时root的右子树要去掉
        if (root.val > high) {
            // 虽然当前节点是大于high的，但是他的左子树可能还有非待删除的值 应该递归遍历左子树才是。
            return trimBST(root.left, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
