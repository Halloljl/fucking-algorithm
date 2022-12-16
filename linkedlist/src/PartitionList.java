/**
 * @author hallo
 * @datetime 2022-12-17 0:15
 * @description
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        // 定义两个新链表
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p = head, p1 = dummy1, p2 = dummy2;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }
            // 断开原链表中的每个节点的 next 指针
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        // 拼接链表
        p1.next = dummy2.next;
        return dummy1.next;
    }

}
