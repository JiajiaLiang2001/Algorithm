/// Leetcode 206. Reverse Linked List
/// https://leetcode.cn/problems/reverse-linked-list/
public class Solution2 {
    /**
     * Reverse linked list recursive solution
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}
