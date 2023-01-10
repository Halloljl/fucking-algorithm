package trees;

/**
 * @author hallo
 * @datetime 2023-1-10 11:00
 * @description 222. 完全二叉树的节点个数
 * https://leetcode.cn/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes2 {

    /**
     * 根据完全二叉树的性质来计算
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 判断是否是满二叉树 --- begin
        // 定义两个指针 分别遍历二叉树的左节点的左节点 和 右节点的右节点
        TreeNode left = root.left, right = root.right;
        // 记录深度
        int lDpeth = 0, rDepth = 0;
        while (left != null) {
            left = left.left;
            lDpeth++;
        }
        while (right != null) {
            right = right.right;
            rDepth++;
        }
        // 判断是否是满二叉树 --- end
        // 用公式计算满二叉树的节点数
        if (lDpeth == rDepth) {
            return (2 << lDpeth) - 1;
        }
        // 如果不是满二叉树 递归遍历左右子树 + 1 (当前节点)
        int lCount = countNodes(root.left);
        int rCount = countNodes(root.right);

        return lCount + rCount + 1;
    }
}
