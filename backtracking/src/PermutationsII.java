import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-10 20:36
 * @description 47. 全排列 II
 * <a href="https://leetcode.cn/problems/permutations-ii/description/">...</a>
 */
public class PermutationsII {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        backtracking(nums, 0, used);
        return result;
    }

    void backtracking(int[] nums, int startIndex, int[] used) {
        if (path.size() == nums.length) { // 收集结果
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // 树枝去重逻辑 前面的已经Cover后面的了     最后一个是标识下个树枝从哪个取数，这个数能不能取
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == 0 || used[i] == 1) {
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
