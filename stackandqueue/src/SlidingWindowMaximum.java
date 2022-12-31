import org.junit.Test;

import java.util.*;

/**
 * @author hallo
 * @datetime 2022-12-23 11:44
 * @description LeetCode：239. 滑动窗口最大值
 * https://leetcode.cn/problems/sliding-window-maximum/
 */
public class SlidingWindowMaximum {
    @Test
    public void test01() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println("maxSlidingWindow(nums,3) = " + Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();

        // 首先添加三个到单调队列中
        MonotoneQueue queue = new MonotoneQueue();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        result.add(queue.maxValue());
        for (int i = k; i < nums.length; i++) {
            queue.poll(nums[i - k]);
            queue.add(nums[i]);
            result.add(queue.maxValue());
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 单调队列实现
     */
    class MonotoneQueue {

        private Deque<Integer> queue;

        public MonotoneQueue() {
            this.queue = new LinkedList<Integer>();
        }

        /**
         * poll元素 移除元素
         * @param val 入参
         * @return 返回移除的元素
         */
        public Integer poll(int val) {
            Integer res = null;
            if (!queue.isEmpty() && queue.peek() == val) {
                 res = queue.poll();
            }
            return res;
        }

        /**
         *  返回单调队列中的最大值
         * @return
         */
        public Integer maxValue() {
            return queue.peek();
        }

        /**
         * 向双端队列中添加元素，如果上一次最后添加的元素大于新添加的值val 那么应该先依个排除前面小于当前添加值的元素。
         * @param val
         */
        public void add(int val) {
            while (!queue.isEmpty() && queue.peekLast() < val) {
                queue.pollLast();
            }
            queue.addLast(val);
        }
    }
}
