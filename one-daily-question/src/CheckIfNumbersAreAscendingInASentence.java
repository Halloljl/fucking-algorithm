/**
 * @author hallo
 * @datetime 2023-01-04 15:24
 * @description 2042. 检查句子中的数字是否递增
 * <a href="https://leetcode.cn/problems/check-if-numbers-are-ascending-in-a-sentence/description/">...</a>
 */
public class CheckIfNumbersAreAscendingInASentence {
    public boolean areNumbersAscending(String s) {
        // 记录以前的值
        int pre = 0;
        // 记录当前遍历的下标
        int pos = 0;
        // 开始遍历
        while (pos < s.length()) {
            // 声明一个变量记录当前值。
            int cur = 0;
            // 确认当前的遍历是否为数字
            if (Character.isDigit(s.charAt(pos))) {
                //  是数字进入 此时还要判断数字的下一位还是不是数字
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    cur = cur * 10 + s.charAt(pos) - '0';
                    pos++;
                }
                // 现在比较与前一位数字
                if (cur <= pre) { return false;}
                // 将值赋值给pre变量 留用下一次循环比较
                pre = cur;
            }
            // 走这里就证明现在遍历的位置不是一个数字，那么就pos指针后移
            pos++;
        }
        // 最后顺利退出while循环 那么证明符合条件 是个递增的数字序列
        return true;
    }
}
