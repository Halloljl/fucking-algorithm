import java.util.HashSet;
import java.util.Set;

/**
 * @author hallo
 * @datetime 2022-12-20 11:13
 * @description 217. 存在重复元素
 * https://leetcode.cn/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // 定义hash盛放元素 ，遍历数组如果里面有这个元素存在，那么就返回true;不存在把新的元素放入
        Set<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            if (hashSet.contains(i)) {
                return true;
            } else {
                hashSet.add(i);
            }
        }
        return false;
    }
}
