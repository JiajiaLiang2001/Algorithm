public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {41, 16, 58, 13, 50, 60, 42, 53, 59, 63};
        for (int num : nums) {
            bst.add(num);
        }
        System.out.println("The floor of bst on 47 is:" + bst.floor(47));
        System.out.println("The ceil of bst on 47 is:" + bst.ceil(47));
    }
}
