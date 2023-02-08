package trees;

/**
 * @author hallo
 * @datetime 2023-01-18 15:02
 * @description 235. 二叉搜索树的最近公共祖先
 * <a href="https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/description/">...</a>
 */
public class LowestCommonAncestorOfABinarySearchTree {
    // 递归法实现
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x = root.val;
        // 根据二叉搜索树的性质 如果 当前节点的值都大于p,q的值 向左方向去找
        if (p.val < x && q.val < x)
            return lowestCommonAncestor(root.left, p, q);
        if (p.val > x && q.val > x)
            // 如果当前节点都小于p,q的值 就是向右去遍历。
            return lowestCommonAncestor(root.right, p, q);
        // 既不pq都小于，也不都大于 可能是 在pq之间  那么这个值就是最近公共祖先，
        // 还有就是遍历到底 也就是root为空时候 那么直接返回root = null 就得了
        return root;
    }
    // 迭代法实现
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        while (root != null) {
//            if (root.val > p.val && root.val > q.val) {
//                root = root.left;
//            } else if(root.val < p.val && root.val < q.val) {
//                root = root.right;
//            } else {
//                return root;
//            }
//        }
//        return root;
//    }
}
