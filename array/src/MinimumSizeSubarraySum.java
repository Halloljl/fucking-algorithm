/**
 * @author hallo
 * @datetime 2022-12-13 16:20
 * @description
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0; // 记录subNums的总和
        int subLength = 0;
        int i = 0;
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLength = j - i + 1;
                sum -= nums[i++];
                result = subLength < result ? subLength : result;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
