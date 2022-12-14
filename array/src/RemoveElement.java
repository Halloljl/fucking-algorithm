/**
 * @author hallo
 * @datetime 2022-12-13 15:23
 * @description
 */
public class RemoveElement {
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
