public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 1, 3, 3, 5, 5, 7, 7};
        System.out.println(BinarySearch.lower(nums, 5));// 3
        System.out.println(BinarySearch.lower(nums, 6));// 5
    }
}
