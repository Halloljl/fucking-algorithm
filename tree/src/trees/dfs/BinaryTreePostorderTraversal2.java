package trees.dfs;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author hallo
 * @datetime 2023-01-08 11:29
 * @description 145. 二叉树的后序遍历
 * <a href="https://leetcode.cn/problems/binary-tree-postorder-traversal/">...</a>
 */
public class BinaryTreePostorderTraversal2 {
    // 迭代方式实现
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // 定义一个栈 用来盛放树的节点
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
