/**
 * @author hallo
 * @datetime 2022-12-18 12:58
 * @description LeetCode 283
 * https://leetcode.cn/problems/move-zeroes/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // 返回的是，除去0的数组的长度
        int l = removeElement(nums, 0);
        // 对原来数组的后续值都替换为0
        for(; l < nums.length; l++) {
            nums[l] = 0;
        }
    }
    // 27 题 removeElement
    public int removeElement(int[] nums, int val) {
        // 定义两个快慢指针
        int fast, slow = 0;
        // 快指针在数组上移动
        for (fast = 0; fast < nums.length; fast++) {
            // 当遇到一个不等于指定值的元素，就放在前面
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        // 最后返回数组长度
        return slow;
    }
}
