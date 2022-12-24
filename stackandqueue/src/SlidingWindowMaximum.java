import org.junit.Test;

import java.util.*;

/**
 * @author hallo
 * @datetime 2022-12-23 11:44
 * @description
 */
public class SlidingWindowMaximum {

    @Test
    public void test01() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        maxSlidingWindow(nums,3);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue queue = new MyQueue();
        List<Integer> result = new ArrayList();
        for (int i = 0; i < k; i++) {
            queue.push(nums[i]);
        }
        result.add(queue.peek());
        for (int i = k; i < nums.length; i++) {
            queue.pop(nums[i -k]);
            queue.push(nums[i]);
            result.add(queue.peek());
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    class MyQueue {
    Deque<Integer> queue;

    public MyQueue() {
         queue = new LinkedList<Integer>();
    }
        int peek() {
            return queue.peek();
        }

        void pop(int val) {
            if (!queue.isEmpty() && queue.peek() == val) {
                queue.poll();
            }
        }

        void push(int val) {
            while (!queue.isEmpty() && queue.peek() < val) {
                queue.removeLast();
            }
            queue.add(val);
        }
    }
}
