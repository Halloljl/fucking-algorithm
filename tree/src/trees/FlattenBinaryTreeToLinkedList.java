package trees;

/**
 * @author hallo
 * @datetime 2023-01-01 14:57
 * @description 114. 二叉树展开为链表
 * <a href="https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/">114. 二叉树展开为链表</a>
 */
public class FlattenBinaryTreeToLinkedList {
    // 定义：将以 root 为根的树拉平为链表
    public void flatten(TreeNode root) {
        if (root == null) { return;}
        // 根据定义分别拉平左右链表
        flatten(root.left);
        flatten(root.right);
        /**** 后序遍历的位置 ****/
        //左右子树拉成一张链表
        TreeNode left = root.left;
        TreeNode right = root.right;

        // 将左子树置为空，右子树转为 左子树
        root.left = null;
        root.right = left;

        // 将原先的右子树放在已转过来的左子树后面
        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
