/**
 * @author hallo
 * @datetime 2022-12-18 13:44
 * @description LeetCode 167
 * https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] nums, int target) {
        // 定义两个指针
        int left = 0, right = nums.length - 1;
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            int actual = nums[left] + nums[right];
            // 如果计算的真实值等于目标值的话，直接返回下标
            if (actual == target) {
             return new int[]{left + 1, right + 1};
            } else if (actual < target) {
                // 此时真实值小于目标值。需要加值。即left向右移动
                left++;
            } else {
                // 此时真实值大于目标值。需要减值。即right向左移动
                right--;
            }
        }
        // 没有匹配,返回
        return new int[]{-1, -1};
    }
}
