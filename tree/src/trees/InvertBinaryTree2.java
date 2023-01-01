package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 15:06
 * @description 226. 翻转二叉树
 * <a href="https://leetcode.cn/problems/invert-binary-tree/">226. 翻转二叉树</a>
 * <a href="https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/">剑指 Offer 27. 二叉树的镜像</a>
 */
public class InvertBinaryTree2 {
    // 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 依次翻转左右孩子
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 然后交换左右子节点
        root.left = right;
        root.right = left;
        return root;
    }

}
