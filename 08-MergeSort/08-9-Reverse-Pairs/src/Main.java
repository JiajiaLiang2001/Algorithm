public class Main {
    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 4};
        Solution solution = new Solution();
        int reversePairs = solution.reversePairs(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        System.out.println(reversePairs);
    }
}
