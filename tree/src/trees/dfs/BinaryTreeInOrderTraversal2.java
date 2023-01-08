package trees.dfs;

import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author hallo
 * @datetime 2023-01-08 11:32
 * @description 94. 二叉树的中序遍历
 *  迭代方式实现
 * <a href="https://leetcode.cn/problems/binary-tree-inorder-traversal/description/">...</a>
 */
public class BinaryTreeInOrderTraversal2 {
    // 迭代方式实现
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}
