/**
 * @author hallo
 * @datetime 2022-12-13 15:23
 * @description
 */
public class RemoveElement {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int fast;
        int slow = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
