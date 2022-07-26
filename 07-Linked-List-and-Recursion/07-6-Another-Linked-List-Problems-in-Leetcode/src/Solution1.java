/// Leetcode 206. Reverse Linked List
/// https://leetcode.cn/problems/reverse-linked-list/
public class Solution1 {
    /**
     * Reverse linked list non-recursive solution
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
