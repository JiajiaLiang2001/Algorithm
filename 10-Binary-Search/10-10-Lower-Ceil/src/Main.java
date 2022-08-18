public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 1, 3, 3, 5, 5, 7, 7};
        int index = BinarySearch.lower_ceil(nums, 5);// 4
        System.out.println(index);
    }
}
