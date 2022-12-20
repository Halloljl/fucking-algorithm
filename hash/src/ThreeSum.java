import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hallo
 * @datetime 2022-12-20 12:16
 * @description 15. 三数之和
 * https://leetcode.cn/problems/3sum/description/
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // 用来盛放结果集
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 在此就表示如果这个值都大于0了 ，因为数组有序 ，后面就没有符合的了
            if (nums[i] > 0) {
                return list;
            }
            // 对于i先去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 来找合适的后两个元素
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重逻辑应该放在找到一个三元组之后，对b 和 c去重
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
        }
        return list;
    }
}
