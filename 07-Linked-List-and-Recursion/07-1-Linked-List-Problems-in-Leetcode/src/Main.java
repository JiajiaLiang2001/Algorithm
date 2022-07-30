public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res1 = (new Solution1()).removeElements(head, 6);
        System.out.println(res1);

        ListNode res2 = (new Solution2()).removeElements(head, 6);
        System.out.println(res2);
    }
}
