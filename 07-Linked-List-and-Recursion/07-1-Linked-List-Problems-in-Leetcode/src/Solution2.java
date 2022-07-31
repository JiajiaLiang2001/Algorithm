/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.cn/problems/remove-linked-list-elements/
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null)
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        return dummyHead.next;
    }
}
