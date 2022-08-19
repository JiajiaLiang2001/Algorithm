public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums)
            bst.add(num);
        bst.postOrder();
        System.out.println();
        bst.postOrderNR();
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
