package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hallo
 * @datetime 2023-01-01 13:18
 * @description
 */
public class Traverse {

    // 输入一棵二叉树的根节点，层序遍历这棵二叉树
    void levelTraverse(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        // 从上到下遍历二叉树的每一层
        while (!q.isEmpty()) {
            int sz = q.size();
            // 从左到右遍历每一层的每个节点
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                // 将下一层节点放入队列
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
        }
    }


    // 现在不借助辅助函数和变量，直接使用preorderTraverse函数来完成
    List<Integer> preorderTraverse2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return null;
        }
        res.add(root.val);
        res.addAll(preorderTraverse2(root.left));
        res.addAll(preorderTraverse2(root.right));

        return res;
    }

    // 以下是遍历的思想来前序遍历
    List<Integer> res = new ArrayList<>();

    List<Integer> preorderTraverse(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
