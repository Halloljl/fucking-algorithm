/**
 * @author hallo
 * @datetime 2022-12-21 14:13
 * @description 151. 反转字符串中的单词
 * https://leetcode.cn/problems/reverse-words-in-a-string/description/
 */
public class ReverseWordsInAString {

    public static void main(String[] args) {
        String s = "he  ni       oo";
        ReverseWordsInAString r = new ReverseWordsInAString();
        String s1 = r.reverseWords(s);
        System.out.println(s1);
    }

    public String reverseWords(String s) {
        // TODO 写的很烂 不知道要考什么
        String s1 = removeSpace(s);
        StringBuilder s2 = new StringBuilder(s1);
        s2.reverse();
        System.out.println(s2);
        String[] s3 = s2.toString().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s3.length; i++) {
            StringBuilder s4 = new StringBuilder(s3[i]);
            res.append(s4.reverse());
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
    public String removeSpace(String s) {
        int fast,slow;
        char[] array = s.toCharArray();
        for (slow = 0, fast = 0; fast < array.length; fast++) {
            if (array[fast] != ' ') {
                if (slow != 0) array[slow++] = ' ';
                while (fast < array.length && array[fast] != ' ') {
                    array[slow++] = array[fast++];
                }
            }
        }
        return new String(array,0, slow);
    }

}
