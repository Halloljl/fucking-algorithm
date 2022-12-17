/**
 * @author hallo
 * @datetime 2022-12-17 14:47
 * @description
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        // 定义一个虚拟头节点
        ListNode dummyHead = new ListNode(-1);

        // 定义一个指针 最开始指向虚拟头节点
        ListNode cur = dummyHead;

        // 当操作链表两个元素交换时候，需要知道的是两个节点以前的节点
        // 两个condition 分别对应 偶数链表 奇数链表
        while (cur.next != null && cur.next.next != null) {
            // 先保存两个需要保存的 留下来备用
            ListNode temp1 = cur.next;
            ListNode temp3 = cur.next.next.next;
            // 开始交换
            cur.next = cur.next.next;
            cur.next.next = temp1;
            temp1.next = temp3;
            // 最后移动指针
            cur = cur.next.next;
        }
        return dummyHead.next;
    }
}
