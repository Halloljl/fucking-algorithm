/**
 * @author hallo
 * @datetime 2023-01-04 14:42
 * @description 2. 两数相加
 * <a href="https://leetcode.cn/problems/add-two-numbers/">...</a>
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // 虚拟头结点（构建新链表时的常用技巧）
        ListNode dummyHead = new ListNode(-1);
        // 指针p负责构建新链表
        ListNode p = dummyHead;
        // 表示进位
        int carry = 0;
        // 现在开始计算
        while (l1 != null || l2 != null) {
            // 取出两个值
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            // 计算
            int sum = n1 + n2 + carry;
            // 处理进位
            carry = sum / 10;
            // 处理填链表上的值
            int val = sum % 10;
            // 构建新节点并链接到新链表上并P指针后移
            ListNode node = new ListNode(val);
            p.next = node;
            p = p.next;
            // 两个链表指针向后移动
            if (l1 != null) { l1 = l1.next;}
            if (l2 != null) { l2 = l2.next;}
        }
        // 此时carry大于0 就相当于多出一位 那么这一位也加上
        if (carry > 0) {
            p.next = new ListNode(carry);
        }
        // 返回结果链表的头结点（去除虚拟头结点）
        return dummyHead.next;
    }
}
