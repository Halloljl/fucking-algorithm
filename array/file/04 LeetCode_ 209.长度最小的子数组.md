
# 滑动窗口---双指针思路
利用指针j表示窗口的结束位置，循环遍历j。累加数值若大于target，则移动窗口的开始位置，即指针i，直至等于target。



```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int i = 0,j,sum = 0,result = Integer.MAX_VALUE,subL;

        for(j = 0; j < nums.length; j++) {
            sum += nums[j];

            while(sum >= target) {
                subL = j - i + 1;
                sum -= nums[i++];
                result = subL < result ? subL : result;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
```
