经典
![image.png](https://cdn.nlark.com/yuque/0/2022/png/27517116/1670929847223-38cdca94-9e03-4b4a-a57e-c7de43872ce3.png#averageHue=%23f9f9f9&clientId=ube58403e-1d1b-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=389&id=ube760587&margin=%5Bobject%20Object%5D&name=image.png&originHeight=389&originWidth=809&originalType=binary&ratio=1&rotation=0&showTitle=false&size=52291&status=done&style=none&taskId=u225e9dbf-79e6-48b0-b750-40dd6bd612d&title=&width=809)

```java
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

/**
 * Definition for singly-linked list.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

```
