/**
 * @author hallo
 * @datetime 2022-12-13 15:42
 * @description
 */
public class SquaresOfaSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int k = result.length - 1;
        int i,j;
        for (i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] * nums[i] >= nums[j] * nums[j]) {
                result[k--] = nums[i] * nums[i];
                i++;
            } else {
                result[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
