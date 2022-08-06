public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        Solution solution = new Solution();
        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}
