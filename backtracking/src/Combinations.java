import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-08 21:30
 * @description 77. 组合
 * <a href="https://leetcode.cn/problems/combinations/description/">...</a>
 */
public class Combinations {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    void backtracking(int n, int k, int startIndex) {
        // 边界条件 组合的个数达到k个 放入结果集并结束
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        // 继续在后续寻找这些条件符合的元素
        // 剪枝操作
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
