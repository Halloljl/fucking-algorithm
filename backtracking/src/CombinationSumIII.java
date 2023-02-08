import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-08 21:58
 * @description 39. 组合总和
 * <a href="https://leetcode.cn/problems/combination-sum/description/">...</a>
 */
public class CombinationSumIII {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList path = new LinkedList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, k, 0, 1);
        return result;
    }

    void backtracking(int n, int k, int sum, int startIndex) {
        // 剪枝操作
        if (sum > n) {
            return;
        }
        // 边界条件 组合中的个数已经够了 无需继续递归
        if (path.size() == k) {
            if (sum == n) {
                result.add(new ArrayList(path));
            }
            return;
        }
        // 剪枝操作 i <= 9 - (k - path.size()) + 1
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            backtracking(n, k, sum, i + 1);
            sum -= i;
            path.removeLast();
        }
    }
}
