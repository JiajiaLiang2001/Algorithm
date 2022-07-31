/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.cn/problems/remove-linked-list-elements/
public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
