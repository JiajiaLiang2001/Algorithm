public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(nums, 2);
        System.out.print(kthLargest);
    }
}
