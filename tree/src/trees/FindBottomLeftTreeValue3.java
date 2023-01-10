package trees;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author hallo
 * @datetime 2023-01-10 16:40
 * @description 513. 找树左下角的值
 * <a href="https://leetcode.cn/problems/find-bottom-left-tree-value/description/">...</a>
 * BFS 解法
 */
public class FindBottomLeftTreeValue3 {
    public int findBottomLeftValue(TreeNode root) {
        // BFS 而不需要BFS那么麻烦
        // 定义一个队列 盛放层元素
        Queue<TreeNode> q = new ArrayDeque<>();
        TreeNode cur = root;
        q.add(root);
        while (!q.isEmpty()) {
            // 不用关心遍历的层数
            cur = q.poll();
            // 此时 添加到队列中应该是 先添加右孩子 再添加做孩子 这样最后弹出队列的是左孩子
            if (cur.right != null) { q.add(cur.right);}
            if (cur.left != null) { q.add(cur.left);}

        }
        return cur.val;
    }
}
