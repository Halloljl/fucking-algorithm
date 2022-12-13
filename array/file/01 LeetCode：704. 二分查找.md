# 手把手带你撕出正确的二分法 | 二分查找法 | 二分搜索法 | LeetCode：704. 二分查找

# 确定循环不变量
就是明确区间
[left.right] 这样的区间就是从最开始left是0，right就是arr.length-1
每次都从这个区间中去找，那么此时的区间while循环就应该写的是while (left < right)
然后更换区间的时候是不包含mid的
[left.right) 就是right更换成arr.length
更换区间的时候也应该包含mid

# 代码实现
明确区间 [left, right]	or	[left, right)
## 左闭右闭写法
```java
class Solution {
    public int search(int[] nums, int target) {
        // 左闭右闭区间 [left, right]
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int middle = (left + right) / 2;

            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
```

## 左闭右闭写法
```java
class Solution {
    public int search(int[] nums, int target) {
        // 左闭右开区间 [left, right]
        int left = 0;
        int right = nums.length;

        while(left < right) {

            int middle = (left + right) / 2;

            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
```
