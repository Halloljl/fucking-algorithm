package trees;

/**
 * @author hallo
 * @datetime 2023-01-18 15:11
 * @description 701. 二叉搜索树中的插入操作
 * <a href="https://leetcode.cn/problems/insert-into-a-binary-search-tree/">...</a>
 */
public class InsertIntoABinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        // 递归到底的情况
        if (root == null) { root = new TreeNode(val);}
        //
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
