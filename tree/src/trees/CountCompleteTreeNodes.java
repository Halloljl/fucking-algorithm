package trees;

/**
 * @author hallo
 * @datetime 2022-12-06 17:06
 * @description 222. 完全二叉树的节点个数
 * https://leetcode.cn/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes {

    /**
     * 递归实现
     * @param root
     * @return
     */
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }
}
