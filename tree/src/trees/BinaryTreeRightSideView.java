package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-08 23:57
 * @description 199. 二叉树的右视图
 * <a href="https://leetcode.cn/problems/binary-tree-right-side-view/description/">...</a>
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0);
        return list;
    }
    List<Integer> list = new ArrayList<>();
    void traverse(TreeNode node, int depth) {
        // 边界条件
        if (node == null) {
            return;
        }
        if (list.size() == depth) {
            list.add(node.val);
        }
        traverse(node.right, depth+1);
        traverse(node.left, depth+1);

    }
}
