import org.junit.Test;

import java.util.Stack;

/**
 * @author hallo
 * @datetime 2022-12-23 0:21
 * @description
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        // 用字符串来做栈 栈底为字符串的开头 栈顶为字符串末尾
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            // 当栈为空的时候或者是栈顶元素与当前遍历的值不符合的时候 加入栈内
            if (res.length() == 0 || res.charAt(res.length() - 1) != c) {
                res.append(c);
            }
            else {
                // 走到这里证明栈不为空，而且栈顶元素相等，那么就弹出栈顶元素。
                res.deleteCharAt(res.length() - 1);
            }
        }
        return res.toString();
    }
}
