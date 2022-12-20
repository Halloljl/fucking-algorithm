package insertionsort;

/**
 * @author hallo
 * @datetime 2022-12-20 23:33
 * @description
 */
public class InsertionSort {
    // 主要思想就像插扑克牌一样 外层循环定位到一个元素，与在他前面的所有元素进行比较
    public void insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            // 这里存值主要是内循环遍历的时候，
            // 最开始i = j的时候这时候 指向的是同一元素此时j - 1 如果要换位置，
            // 就会把nums[i]给替换掉，所以还是要存一下值的
            int temp = nums[i];
            // 最后还是要交换的，定义在外面比较好
            int j;
            for (j = i; j > 0 && temp < nums[j - 1]; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;
        }
    }
}
