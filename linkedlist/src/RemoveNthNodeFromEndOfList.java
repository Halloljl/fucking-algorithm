/**
 * @author hallo
 * @datetime 2022-12-17 10:48
 * @description
 */
public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList r = new RemoveNthNodeFromEndOfList();
        int[] a = new int[]{1,2,3,4,5,6,7};
        ListNode node = new ListNode(a);
        System.out.println(r.removeNthFromEnd(node, 2));
    }

    public ListNode removeNthFromEnd(ListNode head, int k) {
        // 定义一个虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // TODO dummy or head
        ListNode pre =  findFromEnd(dummy, k + 1);
        pre.next = pre.next.next;
        return dummy.next;
    }

    // 返回链表的倒数第 k 个节点
    ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
