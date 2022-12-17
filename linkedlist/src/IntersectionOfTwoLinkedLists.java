/**
 * @author hallo
 * @datetime 2022-12-17 18:58
 * @description
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 首先定义两个指针，分别指向两个链表头
        ListNode p1, p2;
        p1 = headA;
        p2 = headB;

        while (p1 != p2) {
            // p1 走一步，如果走到 A 链表末尾，转到 B 链表
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            // p2 走一步，如果走到 A 链表末尾，转到 B 链表
            if (p2 != null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
