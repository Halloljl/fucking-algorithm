给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
来源：力扣（LeetCode）
链接：[https://leetcode.cn/problems/remove-element](https://leetcode.cn/problems/remove-element)
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

# 双指针思路
定义两个指针分别为 fast slow
fast用来寻找数组所需要的新元素
slow用来记录新数组的下标
当fast标记的元素不是要输出值val时候，就赋值给慢指针指向的地址。
以往下去，最后返回slow指针的值，即为新数组的长度。

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int fast,slow = 0;
        for(fast = 0; fast < nums.length; fast++) {
            if(nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
```
# 暴力
两层for循环
