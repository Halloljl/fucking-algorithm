package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-10 12:19
 * @description 257. 二叉树的所有路径
 * <a href="https://leetcode.cn/problems/binary-tree-paths/description/">...</a>
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root == null) {
            return res;
        }
        List<Integer> paths = new ArrayList<Integer>();
        traverse(root, paths, res);
        return res;
    }

    /**
     *
     * @param root 所要遍历的节点
     * @param paths 存储单条路径上的值
     * @param res 要返回的总的结果集合 递归过程中 一直在收集
     */
    void traverse(TreeNode root, List<Integer> paths, List<String> res) {
        // 首先就刚进入就要加入paths中
        paths.add(root.val);
        // 写边界条件 是否是叶子结点了
        if (root.left == null && root.right == null) {
            // 到叶子结点了 现在处理单条路径 放入结果集
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.size() - 1; i++) {
                sb.append(paths.get(i)).append("->");
            }
            sb.append(paths.get(paths.size() - 1));
            res.add(sb.toString());
            return;
        }

        if (root.left != null) {
            traverse(root.left, paths, res);
            paths.remove(paths.size() - 1); // 回溯过程
        }
        if (root.right != null) {
            traverse(root.right, paths, res);
            paths.remove(paths.size() - 1); // 回溯过程
        }
    }
}
