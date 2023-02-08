import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-08 22:01
 * @description 17. 电话号码的字母组合
 * <a href="https://leetcode.cn/problems/letter-combinations-of-a-phone-number/">...</a>
 */
public class LetterCombinationsOfAPhoneNumber {
    //设置全局列表存储最后的结果
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }
        //迭代处理
        backTracking(digits, 0);
        return list;
    }

    //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    //每次迭代获取一个字符串，所以会设计大量的字符串拼接，所以这里选择更为高效的 StringBuild
    StringBuilder path = new StringBuilder();

    //比如digits如果为"23",num 为0，则str表示2对应的 abc
    public void backTracking(String digits, int index) {
        //遍历全部一次记录一次得到的字符串
        if (index == digits.length()) {
            list.add(path.toString());
            return;
        }
        //str 表示当前num对应的字符串
        String str = numString[digits.charAt(index) - '0'];

        for (int i = 0; i < str.length(); i++) {
            path.append(str.charAt(i));
            backTracking(digits, index + 1);
            //剔除末尾的继续尝试
            path.deleteCharAt(path.length() - 1);
        }
    }
}
