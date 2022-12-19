/**
 * @author hallo
 * @datetime 2022-12-18 14:12
 * @description LeetCode 9. 回文数
 * https://leetcode.cn/problems/palindrome-number/description/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // 先转字符串
        String str = String.valueOf(x);
        // 遍历前一半，比较首尾，并且指针i向后移动
        for(int i = 0;i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
