package trees;

/**
 * @author hallo
 * @datetime 2023-01-18 16:01
 * @description 108. 将有序数组转换为二叉搜索树
 * <a href="https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/description/">...</a>
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }
    // 区间是[lo, hi]左闭右闭的
    private TreeNode dfs(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        // 以升序数组的中间元素作为根节点 root。
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 递归的构建 root 的左子树与右子树。
        root.left = dfs(nums, lo, mid - 1);
        root.right = dfs(nums, mid + 1, hi);
        return root;
    }
}
