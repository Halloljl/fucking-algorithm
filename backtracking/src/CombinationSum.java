import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-08 22:11
 * @description 39. 组合总和
 * <a href="https://leetcode.cn/problems/combination-sum/">...</a>
 */
public class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 排序是为了剪枝操作
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return result;
    }
    LinkedList<Integer> path = new LinkedList<>();
    void backtracking(int[] candidates, int target, int sum, int startIndex) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
