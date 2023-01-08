package trees.dfs;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-08 11:29
 * @description 145. 二叉树的后序遍历
 * <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal/">...</a>
 */
public class BinaryTreePostorderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        travese(root);
        return list;
    }

    // 遍历树 将值加入到结果集中
    void travese(TreeNode root) {
        if (root == null) {
            return ;
        }
        travese(root.left);
        travese(root.right);
        /** 后序遍历的位置 */
        list.add(root.val);
    }
}
