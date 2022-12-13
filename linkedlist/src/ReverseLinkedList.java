/**
 * @author hallo
 * @datetime 2022-12-13 19:33
 * @description
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        // 递归写法二
        return reverse(head, null);


        // 递归写法一
        // if (head == null || head.next == null) {
        //     return head;
        // }
        // ListNode rev = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;

        // return rev;




//        ListNode pre = null,cur = head;
//        while (cur != null) {
//            ListNode tempNext = cur.next;
//            // 反转操作
//            cur.next = pre;
//            // 移动指针
//            pre = cur;
//            cur = tempNext;
//        }
//        return pre;
    }


    public ListNode reverse(ListNode cur, ListNode pre) {
        if(cur == null) {
            return pre;
        }
        // 先保存下个节点
        ListNode next = cur.next;
        // 反转
        cur.next = pre;
        // 移动指针
        return reverse(next, cur);
    }
}
