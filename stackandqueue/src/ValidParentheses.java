import java.util.Stack;

/**
 * @author hallo
 * @datetime 2022-12-23 0:02
 * @description
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        // 定义一个栈，用来存放括号。
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        // 遍历数组
        for (char c : chars) {
            // 遇到左括号，就直接放进栈里面
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                // 写个continue，省的走下面判断了。
                continue;
            }
            if (c == ')' && '(' == stack.peek()) {
                stack.pop();
            }
            if (c == '}' && '{' == stack.peek()) {
                stack.pop();
            }
            if (c == ']' && '[' == stack.peek()) {
                stack.pop();
            }
        }
        // 如果栈都弹出完了，那证明是匹配的。
        return stack.isEmpty();
    }
}
