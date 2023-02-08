import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-08 22:30
 * @description 40. 组合总和 II
 * <a href="https://leetcode.cn/problems/combination-sum-ii/">...</a>
 */
public class CombinationSumII {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // 首先把给candidates排序，让其相同的元素都挨在一起。
        Arrays.sort(candidates);
        int[] used = new int[candidates.length];
        backtracking(candidates, target, 0, 0, used);
        return result;
    }
    LinkedList<Integer> path = new LinkedList<>();
    void backtracking(int[] candidates, int target, int sum, int startIndex,int[] used) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            // used[i - 1] == true，说明同一树枝candidates[i - 1]使用过
            // used[i - 1] == false，说明同一树层candidates[i - 1]使用过
            // 要对同一树层使用过的元素进行跳过
            if (i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == 0) {
                continue;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            used[i] = 1;
            backtracking(candidates, target, sum, i + 1, used);
            sum -= candidates[i];
            path.removeLast();
            used[i] = 0;
        }
    }
}
