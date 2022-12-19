import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hallo
 * @datetime 2022-12-19 20:06
 * @description 349. 两个数组的交集
 * https://leetcode.cn/problems/intersection-of-two-arrays/description/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null
                || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        // 定义一个结果集， 用来盛放交集元素
        HashSet<Integer> result = new HashSet<>();
        // 拿一个桶存放num1所有出现的元素
        HashSet<Integer> bucket = new HashSet<>();
        for (int i : nums1) {
            bucket.add(i);
        }
        // 遍历第二个桶看是否存在 ，存在那即是交集元素 将它放到桶里。
        for (int i : nums2) {
            if (bucket.contains(i)) {
                result.add(i);
            }
        }
        // 再转为数组
        return result.stream().mapToInt(x -> x).toArray();
    }
}
