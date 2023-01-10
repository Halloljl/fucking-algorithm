package trees;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author hallo
 * @datetime 2023-01-10 16:40
 * @description 513. 找树左下角的值
 * <a href="https://leetcode.cn/problems/find-bottom-left-tree-value/description/">...</a>
 * DFS 解法
 */
public class FindBottomLeftTreeValue1 {
    // ans 记录的答案 最底层 最左边 节点的值
    // max 记录从开始到当前遍历时的最大深度
    int ans, max;
    public int findBottomLeftValue(TreeNode root) {
        traverse(root, 1);
        return ans;
    }

    /** 遍历整颗树 不断替换ans */
    void traverse(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > max) {
            // 维护当前遍历的最大深度 和 最大值
            max = depth;
            ans = root.val;
        }
        depth++;
        traverse(root.left, depth);
        depth--; // 回溯过程

        depth++;
        traverse(root.right, depth);
        depth--; // 回溯过程
    }
}
