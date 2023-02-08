package trees;

/**
 * @author hallo
 * @datetime 2023-01-18 15:32
 * @description 450. 删除二叉搜索树中的节点
 * <a href="https://leetcode.cn/problems/delete-node-in-a-bst/">...</a>
 */
public class DeleteNodeInABst {
    /**
     讨论四种情况
     ① 没有要删除的节点
     ② 叶子节点 左右为空
     ③ 左不为空 右为空
     ④ 右不为空 左为空
     ⑤ 左右都不为空
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            // 此时是有要删除的节点
            // ② 叶子节点 左右为空
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            } else {
                // 最复杂的情况 就是左右都不为空
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                cur.left = root.left;
            }
            return root.right;
        }

        // 基本的递归逻辑
        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);

        return root;
    }
}
