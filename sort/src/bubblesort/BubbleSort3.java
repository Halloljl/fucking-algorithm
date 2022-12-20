package bubblesort;

/**
 * @author hallo
 * @datetime 2022-12-19 23:19
 * @description 第三版记录元素最后交换的位置。因为后面已经排好序了，可以多减少几次外循环
 */
public class BubbleSort3 {

    public void bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; ) {
            int lastSwapIndex = 0;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    lastSwapIndex = j + 1;
                }
            }
            i = nums.length - lastSwapIndex;
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
