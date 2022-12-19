/**
 * @author hallo
 * @datetime 2022-12-18 12:18
 * @description LeetCode 26
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // 定义两个指针，一个快指针，一个慢指针
        int slow = 0,fast = 0;
        // 让快指针在前面走，遍历整个数组
        for (fast = 0; fast < nums.length; fast++) {
            // 如果快指针所指向的值与慢指针相等，就替换慢指针的值。
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
        }
        // 最后返回数组长度
        return slow + 1;
    }
}
