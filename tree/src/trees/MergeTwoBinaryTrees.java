package trees;

/**
 * @author hallo
 * @datetime 2023-01-13 19:48
 * @description 617. 合并二叉树
 * <a href="https://leetcode.cn/problems/merge-two-binary-trees/">...</a>
 */
public class MergeTwoBinaryTrees {
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            // 先写边界条件
            if (root1 == null) { return root2;}
            if (root2 == null) { return root1;}

            root1.val += root2.val;

            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);

            return root1;
        }
    }
}
