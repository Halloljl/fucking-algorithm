import java.util.Stack;

/**
 * @author hallo
 * @datetime 2022-12-23 0:21
 * @description
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        int size = stack.size();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}
