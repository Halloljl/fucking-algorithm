import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-02-09 22:48
 * @description 90. 子集 II
 * <a href="https://leetcode.cn/problems/subsets-ii/description/">...</a>
 */
public class SubsetsII {
    List<List<Integer>> result = new ArrayList<>(); // 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>(); // 用来存放符合条件结果

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums, 0);
        return result;
    }

    void backtracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path)); //「遍历这个树的时候，把所有节点都记录下来，就是要求的子集集合」。
        if (startIndex >= nums.length) { //终止条件可不加
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (i > startIndex && nums[i - 1] == nums[i]) {
                continue;
            }
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }
}
