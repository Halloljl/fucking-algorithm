/**
 * @author hallo
 * @datetime 2022-12-13 18:46
 * @description
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        // 使用递归
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;

        // // 不使用虚拟头节点
        // while (head != null && head.val == val) {
        //     head = head.next;
        // }
        // if (head == null) {
        //     return head;
        // }

        // ListNode prev = head;
        // while (prev.next != null) {
        //     if (prev.next.val == val) {
        //         prev.next = prev.next.next;
        //     } else {
        //         prev = prev.next;
        //     }
        // }
        // return head;


        // // 使用虚拟头节点
        // ListNode dummyHead = new ListNode();
        // dummyHead.next = head;


        // ListNode curr = dummyHead;
        // while(curr.next != null) {
        //     if(curr.next.val == val) {
        //         curr.next = curr.next.next;
        //     } else {
        //         curr = curr.next;
        //     }
        // }

        // return dummyHead.next;
    }
}


