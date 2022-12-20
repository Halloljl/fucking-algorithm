package bubblesort;

import java.util.Arrays;

/**
 * @author hallo
 * @datetime 2022-12-19 22:56
 * @description 第二版冒泡排序
 */
public class BubbleSort2 {

    public void bubbleSort(int[] nums) {
        // 从第一个开始遍历
        for (int i = 0; i < nums.length; i++) {
            // 增加了一个标记 用来标记就是下面的j遍历走了一圈
            // 如果没有交换元素发生，也就是后边是有序的 此时就可以退出外层循环了
            boolean flag = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
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
