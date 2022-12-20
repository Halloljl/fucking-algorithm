import java.util.HashMap;
import java.util.List;

/**
 * @author hallo
 * @datetime 2022-12-20 11:41
 * @description
 */
public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // 先存下数组的长度，题中给定数字长度都为n
        int n = nums1.length;
        int result = 0;
        // 定义一个hashMap 存放前两个数组穷举的遍历和
        //  key -> 和
        //  value -> 次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // 遍历前两个数组，往里面放元素
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               int sum12 = nums1[i] + nums2[j];
               if (hashMap.containsKey(sum12)) {
                   hashMap.put(sum12, hashMap.get(sum12) + 1);
               } else {
                   hashMap.put(sum12, 1);
               }
            }
        }
        // 再遍历后两个数组穷举所有值，去hashMap里面寻找
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum34 = nums3[i] + nums4[j];
                if (hashMap.containsKey(0-sum34)) {
                    // 如果里面包含 Key 那么取出 value（次数）
                    result += hashMap.get(0-sum34);
                }
            }
        }
        return result;
    }
}
