public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {41, 16, 58, 13, 50, 60, 42, 53, 59, 63};
        for (int num : nums) {
            bst.add(num);
        }
        System.out.println(bst.select(4));
    }
}
