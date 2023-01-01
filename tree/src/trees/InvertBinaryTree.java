package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 14:58
 * @description 226. 翻转二叉树
 * <a href="https://leetcode.cn/problems/invert-binary-tree/">226. 翻转二叉树</a>
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // 遍历二叉树，交换每个左右孩子
        traverse(root);
        return root;
    }
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 交换左右孩子节点
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 递归左右孩子
        traverse(root.left);
        traverse(root.right);
    }
}
