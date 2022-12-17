/**
 * @author hallo
 * @datetime 2022-12-16 23:56
 * @description
 */
public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        ListNode(int[] arr) {
                this.val = arr[0];
                ListNode cur = this;
                for (int i = 1; i < arr.length; i++) {
                        cur.next = new ListNode(arr[i]);
                        cur = cur.next;
                }
        }

        @Override
        public String toString() {
                StringBuilder res = new StringBuilder();
                ListNode dummy = new ListNode(-1);
                ListNode p = this;
                while (p != null) {
                        res.append(p.val).append(" -> ");
                        p = p.next;
                }
                res.append("NULL");
                return res.toString();
        }
}
