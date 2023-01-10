package trees;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hallo
 * @datetime 2023-01-10 22:48
 * @description
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i = 0; i < inorder.length - 1; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    /*
        build 函数的定义：
        若前序遍历数组为 preorder[preStart..preEnd]，
        中序遍历数组为 inorder[inStart..inEnd]，
        构造二叉树，返回该二叉树的根节点
    */
    TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        // 边界条件
        if (preStart > preEnd) {return null;}
        // 前序遍历的第一个值就是
        int rootVal = preorder[preStart];
        int index = map.get(rootVal);
        // 递归构造左右子树
        int leftSize = index - inStart;

        // 先构造出当前根节点
        TreeNode root = new TreeNode(rootVal);

        build(preorder, preStart + 1, preStart + leftSize, inorder, inStart, index - 1);
        build(preorder, preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd);

        return root;
    }
}
