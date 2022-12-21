package selectionsort;

/**
 * @author hallo
 * @datetime 2022-12-20 23:04
 * @description
 */
public class SelectionSort {
    public void selectionSort(int[] nums) {
        // 思想就是遍历数组 区间不变量nums[0,i - 1]都是有序的
        // 在后面中nums[i,length]中找到最小的元素，与之交换
        for (int i = 0; i < nums.length; i++) {
            // 首先默认i的位置就只最小元素 此变量用来记录下最小值的下标
            int minValue = i;
            // 进入循环 在nums[i,length]中找到最小的元素 
            // 此处 j = i + 1 而不是i 避免自己和自己比较 省去进入一次内循环。
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minValue]) {
                    // 变更最小元素的下标
                    minValue = j;
                }
            }
            // 外层循环已经完成，已经找到了后面区间最小元素，交换两元素位置
            swap(nums, i, minValue);
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
