import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author hallo
 * @datetime 2022-12-31 23:10
 * @description LeetCode：347.前 K 个高频元素
 * https://leetcode.cn/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        // 定义一个map，用来盛放元素的值和对应出现的频次
        HashMap<Integer, Integer> map = new HashMap<>();
        // 放入 map 中
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 定义一个最小堆
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // 添加进入优先队列
            pq.offer(entry);
            if (pq.size() > k) {
                // 弹出最小元素，维护队列内是 k 个频率最大的元素
                pq.poll();
            }
        }
        // 依次从队列中取出元素放入结果集中
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            // res 数组中存储前 k 个最大元素
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}
