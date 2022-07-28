public class Main {
    private static final int opCount = 100000;

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = TestHelper.testStack(arrayStack, opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = TestHelper.testStack(linkedListStack, opCount);
        System.out.println("LinkedListStack, time: " + time2 + " s");
    }
}
