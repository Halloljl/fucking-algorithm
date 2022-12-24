import org.junit.Test;

import java.util.Stack;

/**
 * @author hallo
 * @datetime 2022-12-23 11:03
 * @description
 */
public class EvaluateReversePolishNotation {

    @Test
    public void test1(){
        String[] tokens = new String[]{"4","3", "-"};
        System.out.println(evalRPN(tokens));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int res = 0;
                if (token.equals("+")) { res = num2 + num1;}
                if (token.equals("-")) { res = num2 - num1;}
                if (token.equals("*")) { res = num2 * num1;}
                if (token.equals("/")) { res = num2 / num1;}
                stack.push(res);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
