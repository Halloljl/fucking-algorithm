package trees;

/**
 * @author hallo
 * @datetime 2022-12-06 17:06
 * @description
 * leetcode 222
 * count_complete_tree_nodes
 */
public class count_complete_tree_nodes {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(countNodes(root));
    }

    /**
     * 递归实现
     * @param root
     * @return
     */
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
