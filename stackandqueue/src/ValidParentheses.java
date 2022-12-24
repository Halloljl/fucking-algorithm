import java.util.HashMap;
import java.util.Stack;

/**
 * @author hallo
 * @datetime 2022-12-23 0:02
 * @description
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        // 若为奇数个直接返回即可
        if (s.length() % 2 == 1) { return false;}
        HashMap<Character, Character> map = new HashMap<Character, Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
