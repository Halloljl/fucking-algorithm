import java.util.Stack;

class MyQueue {
    // 先定义两个栈，stackIn进栈与队列入口同方向 stackOut出栈与队列出口同方向
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    /**
     * 将元素x推到队列的末尾
     * @param x
     */
    public void push(int x) {
        stackIn.push(x);
    }

    /**
     * 从队列的开头移除并返回元素
     * @return
     */
    public int pop() {
        if (!stackOut.isEmpty()) {
            // 如果stackOut不是空的，那么就直接弹出元素。
            return stackOut.pop();
        }
        // 走到此处，那就是栈是空的，此时就要将stackIn的值移到stackOut中来，
        // 然后在stackOut中弹出元素。
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    /**
     * 返回队列开头的元素
     * @return
     */
    public int peek() {
        // 此处是先在stackOut中弹出栈顶元素，再将其放回。
        int stackTop = pop();
        stackOut.push(stackTop);
        return stackTop;
    }

    /**
     * 如果队列为空，返回 true ；否则，返回 false
     * @return
     */
    public boolean empty() {
        // 两个栈都为空，队列才为空。
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */