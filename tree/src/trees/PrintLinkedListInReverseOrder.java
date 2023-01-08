package trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-08 10:45
 * @description 剑指 Offer 06. 从尾到头打印链表
 * <a href="https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/">...</a>
 */
public class PrintLinkedListInReverseOrder {
    public int[] reversePrint(ListNode head) {
        // 遍历数组
        traverse(head);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    // 先声明一个集合 用来盛放结果集。
    List<Integer> res = new ArrayList();
    // 不需要返回值 直接放List集合里面了
    public void traverse(ListNode head) {
        if (head == null) {
            return ;
        }
        // 开始递归遍历
        traverse(head.next);
        res.add(head.val);
    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) {
        this.val = x;
    }
}
