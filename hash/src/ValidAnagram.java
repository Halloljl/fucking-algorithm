/**
 * @author hallo
 * @datetime 2022-12-19 19:45
 * @description 242. 有效的字母异位词
 * https://leetcode.cn/problems/valid-anagram/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // 首先最该排除的就是 俩字符串长度不一样的
        if (s.length() != t.length()) {
            return false;
        }
        // 定义一个hashBucket 用来盛放s的字符 并减掉t的字符
        int[] hashBucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashBucket[s.charAt(i) - 'a']++;
            hashBucket[t.charAt(i) - 'a']--;
        }
        // 最后就是看如果是有效的字母异位词，那么应该桶里面都还是0
        for (int i : hashBucket) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
