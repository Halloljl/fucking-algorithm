package trees;

/**
 * @author hallo
 * @datetime 2023-01-13 19:49
 * @description
 */
public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) { return null;}
        if (root.val == val) { return root;}

        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }


//    // 迭代法
//    public TreeNode searchBST(TreeNode root, int val) {
//        while (root != null) {
//            if (root.val == val) { break;}
//            root = root.val > val ? root.left : root.right;
//        }
//        return root;
//    }
}
