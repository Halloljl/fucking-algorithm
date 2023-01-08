package trees.dfs;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-08 11:32
 * @description 94. 二叉树的中序遍历
 * <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/description/">...</a>
 */
public class BinaryTreeInOrderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        travese(root);
        return list;
    }

    // 遍历树 将值加入到结果集中
    void travese(TreeNode root) {
        if (root == null) {
            return ;
        }
        travese(root.left);
        /** 中序遍历的位置 */
        list.add(root.val);
        travese(root.right);

    }
}
