package trees;

/**
 * @author hallo
 * @datetime 2023-01-10 17:05
 * @description 112. 路径总和
 * <a href="https://leetcode.cn/problems/path-sum/description">...</a>
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {return false;}
        // 如果是叶子节点了 且值匹配 返回true
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        // 如果是叶子节点了 且值不匹配 返回false
        if (root.left == null && root.right == null && sum != root.val) {
            return false;
        }

        if (root.left != null) {
            sum -= root.val;
            if (hasPathSum(root.left, sum)) {
                return true;
            }
            sum += root.val; // 回溯过程
        }
        if (root.right != null) {
            sum -= root.val;
            if (hasPathSum(root.right, sum)) {
                return true;
            }
            sum += root.val; // 回溯过程
        }
        return false;
    }


//    public boolean hasPathSum(TreeNode root, int sum) {
//        if(root == null){
//            return false;
//        }
//        // 现在走到了叶子节点 判断 是否减到最后叶子节点相等了
//        if(root.left == null && root.right == null){
//            return root.val == sum;
//        }
//        // || 一真则返回就为真 妙
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }
}
