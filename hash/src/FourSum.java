import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hallo
 * @datetime 2022-12-21 12:23
 * @description 18. 四数之和
 * https://leetcode.cn/problems/4sum/description/
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // 用来盛放结果集
        List<List<Integer>> list = new ArrayList<>();
        // 进行排序
        Arrays.sort(nums);
        // -4, -1, 0, 0  target = -5
        for (int k = 0; k < nums.length; k++) {
            // 如果这个有序数组，当前遍历的值已经大于target 并且满足条件target是大于0的
            // 因为对于 -4, -1, 0, 0  target = -5 这种情况确实是nums[k] > target
            // 但是两个负数相加是会更小的，为了避免错过这个元组 应该加条件 target > 0
            if (nums[k] > target && target > 0) {
                // 此刻的情况就是没有符合的元组了，要跳出循环
                return list;
            }
            // 然后就是做去重操作 因为题意 注意：a、b、c 和 d 互不相同
            // 此处 k > 0 保证第一个指定能继续执行下面， 然后后面如果有重复元素的
            // {-2, -1, -1, -1, 0, 1, 2}; 第一个-1还是能继续执行下面的代码的，而是建个后面的-1进行了去重操作。
            if (k > 0 && nums[k] == nums[k - 1]) {
                // 执行下一次循环去
                continue;
            }
            // 现在寻找第二个数
            for (int i = k + 1; i < nums.length; i++) {
                // if (nums[k] + nums[i] > target && target > 0) {
                //     break;
                // }
                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    // 执行下一次循环去
                    continue;
                }
                // 来找合适的后两个元素
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    // 此处注意取值范围 已经超过int
                    long sum =(long) nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        list.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        // 去重逻辑应该放在找到一个三元组之后，对b 和 c去重
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
