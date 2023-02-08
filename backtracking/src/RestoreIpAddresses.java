import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-08 23:23
 * @description 93. 复原 IP 地址
 * <a href="https://leetcode.cn/problems/restore-ip-addresses/description/">...</a>
 */
public class RestoreIpAddresses {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtracking(s, 0, 0);
        return result;
    }

    void backtracking(String s,int startIndex,int pointSum) {
        if (pointSum == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                result.add(s);
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);    //在str的后⾯插⼊⼀个逗点
                pointSum += 1;
                backtracking(s, i + 2, pointSum);
                pointSum -= 1;
                s = s.substring(0, i + 1) + s.substring(i + 2);// 回溯删掉逗点
            } else {
                break;
            }
        }
    }

    // 判断字符串s在左闭⼜闭区间[start, end]所组成的数字是否合法
    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}
