import java.util.Arrays;

/**
 * @author hallo
 * @datetime 2022-12-18 14:01
 * @description LeetCode 344. 反转字符串
 * https://leetcode.cn/problems/reverse-string/
 */
public class ReverseString {

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        r.reverseString(s);
        System.out.println("s = " + Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        for(int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            s[j] ^= s[i];
            s[i] ^= s[j];
            s[j] ^= s[i];
        }
    }
}
