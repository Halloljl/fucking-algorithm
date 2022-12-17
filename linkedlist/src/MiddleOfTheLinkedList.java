/**
 * @author hallo
 * @datetime 2022-12-17 17:52
 * @description
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        // 定义两个指针
        ListNode fast = head, slow = head;
        // 让快指针走两步 慢指针走一步
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
