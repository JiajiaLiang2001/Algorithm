public class Sum {
    /**
     * Call the summation method entry
     *
     * @param arr
     * @return
     */
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * Calculate the sum of all numbers in the interval arr[l...n)
     *
     * @param arr
     * @param l
     * @return
     */
    private static int sum(int[] arr, int l) {
        if (l == arr.length)
            return 0;
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        // sum(arr,0) --> [0,7)
        // arr[0]+sum(arr,1) --> [1,7)
        // arr[0]+arr[1]+sum(arr,2) --> [2,7)
        // ...
        // arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+sum(arr,7) --> sum[7,7)
        // arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+sum(arr,8) --> 0
        System.out.println(sum(nums));
    }
}
