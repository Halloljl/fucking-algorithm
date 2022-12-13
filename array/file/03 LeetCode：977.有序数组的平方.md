# 双指针思路
定义一个新的数组，定义一个新数组的索引下标k，
定义两个指针i,j,
i起始在原始数组开头
j起始在原始数组末尾
for循环使i,j向中间合拢
比较平方，将MAX赋值给k下标的元素

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,j,k = nums.length - 1;
        int[] result = new int[nums.length];
        for(i = 0, j = nums.length - 1; i <= j; ) {
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
```
