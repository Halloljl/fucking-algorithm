package trees;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hallo
 * @datetime 2023-01-10 23:13
 * @description
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    Map<Integer, Integer> map;  // 方便根据数值查找位置
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) { // 用map保存中序序列的数值对应位置
            map.put(inorder[i], i);
        }
        return build(inorder,  0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    /*
        build 函数的定义：
        若中序遍历数组为 inorder[inStart..inEnd]，
        后序遍历数组为 postorder[postStart..prostEnd]，
        构造二叉树，返回该二叉树的根节点
    */
    TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        // 边界条件
        if (postStart > postEnd) {return null;}
        // root 节点对应的值就是后序遍历数组的最后一个元素
        int rootVal = postorder[postEnd];
        // rootVal 在中序遍历数组中的索引
        int index = map.get(rootVal);
        // 左子树的节点个数
        int leftSize = index - inStart;

        // 先构造出当前根节点
        TreeNode root = new TreeNode(rootVal);
        // 递归构造左右子树
        root.left = build(inorder, inStart, index - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = build(inorder, index + 1, inEnd, postorder, postStart + leftSize, postEnd - 1);

        return root;
    }
}
