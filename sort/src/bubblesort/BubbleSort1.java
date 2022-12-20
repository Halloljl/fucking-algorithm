package bubblesort;

import java.util.Arrays;

/**
 * @author hallo
 * @datetime 2022-12-19 21:53
 * @description 第一版冒泡排序
 */
public class BubbleSort1 {

    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 每次都是从头开始所以 j = 0 然后把元素遇到低的就交换
            // 减去1是那个有j+1的存在 然后-i是为了拍好序的不要拍了
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        if(index1 == index2) return;
        // 此处有个Bug 就是在两个索引一样的时候，异或自己 就会变成0 增加上面一行代码
        nums[index1] ^= nums[index2];
        nums[index2] ^= nums[index1];
        nums[index1] ^= nums[index2];
    }


}
