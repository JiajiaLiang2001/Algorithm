import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {28, 16, 30, 13, 29, 42};

        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////
        for (int num : nums) {
            bst.add(num);
        }
        bst.remove(30);
    }

    public static <E extends Comparable<E>> void testRemoveMin(BST<E> bst) {
        ArrayList<E> nums = new ArrayList<>();
        while (!bst.isEmpty())
            nums.add(bst.removeMin());
        isSmallToLarge(nums);
        System.out.println("removeMin test completed.");
        traversePrint(nums);
    }

    public static <E extends Comparable<E>> void isSmallToLarge(ArrayList<E> nums) {
        for (int i = 1; i < nums.size(); i++)
            if (nums.get(i - 1).compareTo(nums.get(i)) > 0)
                throw new IllegalArgumentException("Error!");
    }

    public static <E extends Comparable<E>> void testRemoveMax(BST<E> bst) {
        ArrayList<E> nums = new ArrayList<>();
        while (!bst.isEmpty())
            nums.add(bst.removeMax());
        isLargeToSmall(nums);
        System.out.println("removeMax test completed.");
        traversePrint(nums);
    }

    public static <E extends Comparable<E>> void isLargeToSmall(ArrayList<E> nums) {
        for (int i = 1; i < nums.size(); i++)
            if (nums.get(i - 1).compareTo(nums.get(i)) < 0)
                throw new IllegalArgumentException("Error!");
    }

    public static <E extends Comparable<E>> void traversePrint(ArrayList<E> nums) {
        for (E num : nums) System.out.print(num + " ");
        System.out.println();
    }
}
