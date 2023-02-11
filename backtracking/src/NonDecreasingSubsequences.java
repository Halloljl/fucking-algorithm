import java.util.*;

/**
 * @author hallo
 * @datetime 2023-02-10 19:51
 * @description 491. 递增子序列
 * <a href="https://leetcode.cn/problems/non-decreasing-subsequences/">...</a>
 */
public class NonDecreasingSubsequences {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return result;
    }

    void backtracking(int[] nums, int startIndex) {
        if (path.size() > 1) { // 收集符合条件的子集（至少有两个元素）
            result.add(new ArrayList<>(path));
        }
        Set<Integer> set = new HashSet<>(); // 每一层的Set
        for (int i = startIndex; i < nums.length; i++) {
            // 这里前两个条件 那是 在树枝上避免非递增的子序列 后一个条件 防止树层上的重复
            if (!path.isEmpty() && nums[i] < path.peekLast() || set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }
}
