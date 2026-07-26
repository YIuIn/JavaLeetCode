package medium;

public class LC019删除链表的倒数第N个节点 {
/*    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode();
            dummy.next = head;
            remove(dummy, n);
            return dummy.next;
        }

        private int remove(ListNode head, int n) {
            if (head.next == null) {
                return 1;
            }

            int num = remove(head.next, n);
            if (num == n) {
                head.next = head.next.next;
            }
            return num + 1;
        }
    }*/
}
