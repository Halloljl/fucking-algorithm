package trees;

/**
 * @author hallo
 * @datetime 2023-01-18 16:17
 * @description 1038. 从二叉搜索树到更大和树 538. 把二叉搜索树转换为累加树
 * <a href="https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/">...</a>
 * <a href="https://leetcode.cn/problems/convert-bst-to-greater-tree/description/">...</a>
 */
public class BinarySearchTreeToGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
    // 记录上一个节点的值
    int pre = 0;
    void traverse(TreeNode cur) {
        if (cur == null) {
            return;
        }
        /**right mid left */
        traverse(cur.right);
        cur.val += pre;
        pre = cur.val;
        traverse(cur.left);
    }
}
