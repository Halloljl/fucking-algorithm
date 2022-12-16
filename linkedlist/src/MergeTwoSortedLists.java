/**
 * @author hallo
 * @datetime 2022-12-16 23:55
 * @description
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 首先定义一个新链表 ，使用虚拟头节点
        ListNode dummy = new ListNode(-1);
        // 定义了一个p指针，在新链表上运动
        ListNode p = dummy;
        // 定义了两个指针 分别在两条原链表上活动，指向的是将要放进新的链表中的元素
        ListNode p1 = l1, p2 = l2;
        // 现在开始循环 while(condition) 进了while循环 表示二者可比较
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                // 当前情况就是 p1所指向的值小于p2所指向的值
                // 链接到新的链表上
                p.next = p1;
                p1 = p1.next;
            } else {
                // 当前情况就是 p1所指向的值大于p2所指向的值
                p.next = p2;
                p2 = p2.next;
            }
            // p指针向后移动
            p = p.next;
        }
        // 退出循环了，表示有一个链表或者两个链表已经到头了
        // p1 到头了
        if (p1 == null) {
            p.next = p2;
        }
        // p2 到头了
        if (p2 == null) {
            p.next = p1;
        }
        return dummy.next;
    }
}
