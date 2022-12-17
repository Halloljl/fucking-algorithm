import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author hallo
 * @datetime 2022-12-17 10:01
 * @description
 */
public class MergeKSortedLists {

    public static void main(String[] args) {
        MergeKSortedLists m = new MergeKSortedLists();
        int[] l1 = {1,4,5};
        int[] l2 = {1,3,4};
        int[] l3 = {2,6};
        ListNode[] lists = {new ListNode(l1), new ListNode(l2), new ListNode(l3)};
        System.out.println(m.mergeKLists(lists));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        // 优先级队列，最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (o1, o2) -> o1.val - o2.val);
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }
        ListNode cur = dummy;
        while (!pq.isEmpty()) {
            // 获取最小节点，接到结果链表中
            ListNode node = pq.poll();
            cur.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
