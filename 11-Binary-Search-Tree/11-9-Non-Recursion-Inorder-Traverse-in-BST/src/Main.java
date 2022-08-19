public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {28,16,30,13,22,29,42};
        for (int num : nums)
            bst.add(num);
        bst.inOrder();
        System.out.println();
        bst.inOrderNR();
        System.out.println();
        /////////////////
        //      5      //
        //    /   \    //
        //   3    6    //
        //  / \    \   //
        // 2  4     8  //
        /////////////////
        System.out.println(bst);
    }
}
