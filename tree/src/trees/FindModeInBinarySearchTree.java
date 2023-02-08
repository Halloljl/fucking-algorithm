package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-14 11:13
 * @description 501. 二叉搜索树中的众数
 * <a href="https://leetcode.cn/problems/find-mode-in-binary-search-tree/"></a>
 */
public class FindModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        traverse(root);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    // 用来盛放结果集的集合
    List<Integer> result = new ArrayList<>();
    // 指向前一个节点的指针
    TreeNode pre = null;
    // 单个数的出现次数
    int count;
    // 最大出现次数
    int maxCount = 0;
    // 遍历整颗树 得到答案
    void traverse (TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        /**中序遍历 */
        // pre == null 是刚进来递归到底的情况 开始计数当前root节点的次数
        if (pre == null) {
            count = 1;
        } else if (pre.val == root.val) {
            // 当前值和 pre的值相等 维护 count++
            count++;
        } else {
            // 不相等的情况 那重新计数count为1
            count = 1;
        }
        // 如果 count == 出现最大频次
        if (count == maxCount) {
            // 加入结果集中
            result.add(root.val);
        }
        if (count > maxCount) {
            // 大于 清空再加入
            maxCount = count;
            result.clear();
            result.add(root.val);
        }
        // 指针向后移动
        pre = root;
        traverse(root.right);
    }
}
