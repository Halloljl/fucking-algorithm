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
public class FindBottomLeftTreeValue2 {
    public int findBottomLeftValue(TreeNode root) {
        // BFS
        // 定义一个队列 盛放层元素
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        // 存放结果的变量
        int ans = 0;
        while (!q.isEmpty()) {
            // 取出这一层的大小
            int sz = q.size();
            // 得到这一层第一个的值 即为最左的值
            ans = q.peek().val;
            while (sz-- > 0) {
                TreeNode cur = q.poll();
                if (cur.left != null) { q.add(cur.left);}
                if (cur.right != null) { q.add(cur.right);}
            }
        }
        return ans;
    }
}
