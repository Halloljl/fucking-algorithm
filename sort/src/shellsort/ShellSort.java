package shellsort;

import java.util.Arrays;

/**
 * @author hallo
 * @datetime 2022-12-24 19:47
 * @description
 */
public class ShellSort {

    public void shellSort(int[] nums) {
        int offset = nums.length;
        do {
            // 步长
            offset = offset / 3 + 1;
            // 现在开始排序
            for(int i = offset; i < nums.length; i++){
                    int temp = nums[i];
                    int j;
                    // 里面用的是插入排序
                    for (j = i - offset; j >= 0 && temp < nums[j] ; j-=offset) {
                        nums[j + offset] = nums[j];
                    }
                    nums[j + offset] = temp;
                }
        } while (offset > 1);
    }
}
