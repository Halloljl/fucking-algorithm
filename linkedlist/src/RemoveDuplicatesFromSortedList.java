/**
 * @author hallo
 * @datetime 2022-12-18 12:34
 * @description
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        // 定义两个指针，一个快指针，一个慢指针
        ListNode slow = head,fast = head;
        // 让快指针在前面走，遍历整个链表
        while (fast != null) {
            // 当遇到不同的值的时候，就链接上
            if (fast.val != slow.val) {
                // 链接上
                slow.next = fast;
                // slow 指针向后移动
                slow = slow.next;
            }
            // 快指针的每次循环移动
            fast = fast.next;
        }
        // 断开后续链表的连接
        slow.next = null;
        // 最后返回数组长度
        return head;
    }
}
