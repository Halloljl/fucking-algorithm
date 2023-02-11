import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-10 20:20
 * @description 46. 全排列
 * <a href="https://leetcode.cn/problems/permutations/">...</a>
 */
public class Permutations {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        backtracking(nums, 0, used);
        return result;
    }

    void backtracking(int[] nums, int startIndex, int[] used) {
        if (path.size() == nums.length) { // 收集结果
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1) {
                continue;
            }
            used[i] = 1;
            path.add(nums[i]);
            backtracking(nums, i + 1, used);
            used[i] = 0;
            path.removeLast();
        }
    }
}
