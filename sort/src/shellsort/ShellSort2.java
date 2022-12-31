package shellsort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author hallo
 * @datetime 2022-12-25 10:58
 * @description
 */
public class ShellSort2 {
    @Test
    public void test01() {
        int[] nums = new int[]{1,3,9,-1,100,7,7,9};
        shellSort(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    public void shellSort(int[] nums) {
        int offset = nums.length;
        while (offset > 1) {
            offset = offset / 3 + 1;
            for (int i = offset; i < nums.length; i++) {
                int temp = nums[i];
                int j;
                for (j = i - offset; j >= 0 && temp < nums[j]; j -= offset) {
                    nums[j + offset] = nums[j];
                }
                nums[j + offset] = temp;
            }
        }
    }
}
