import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    /**
     * 将元素 x 压入栈顶。
     * @param x
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * 移除并返回栈顶元素。
     * @return
     */
    public int pop() {
        int size = queue.size();
        while (size-- > 1) {
            queue.add(queue.poll());
        }
        return queue.poll();
    }

    /**
     * 返回栈顶元素。
     * @return
     */
    public int top() {
        // 返回值一直都是队列的最新元素，将其返回即可。
        int queueLatest = pop();
        // 再将其添加回去，这样又是最新的一个元素
        this.push(queueLatest);
        return queueLatest;
    }

    /**
     *  如果栈是空的，返回 true ；否则，返回 false 。
     * @return
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */