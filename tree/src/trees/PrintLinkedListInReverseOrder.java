package trees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hallo
 * @datetime 2023-01-01 12:31
 * @description 倒序打印一个链表
 */
public class PrintLinkedListInReverseOrder {

    @Test
    public void test01() {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        traverse(root);
        System.out.println(list);
    }
    List<Integer> list = new ArrayList<>();
    public void traverse(ListNode root) {
        if (root == null) {
            return;
        }
        traverse(root.next);
        list.add(root.val);
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    ListNode(int[] arr) {
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode dummy = new ListNode(-1);
        ListNode p = this;
        while (p != null) {
            res.append(p.val).append(" -> ");
            p = p.next;
        }
        res.append("NULL");
        return res.toString();
    }
}