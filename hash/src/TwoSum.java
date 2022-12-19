import java.util.HashMap;

/**
 * @author hallo
 * @datetime 2022-12-19 21:07
 * @description 1. 两数之和
 * https://leetcode.cn/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // 定义一个hashMap结构 key用来存放nums1的value, value用来存放对应在nums2的index
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 查表，看看是否有能和 nums[i] 凑出 target 的元素
            int need = target - nums[i];
            if (hashMap.containsKey(need)) {
                return new int[]{hashMap.get(need), i};
            }
            // 没有进入if判断里面那就证明没有需要的值 就把当前值存入 val -> index 的映射
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
