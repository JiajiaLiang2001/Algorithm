public class Main {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
        }
        System.out.println(linkedListStack);

        System.out.println(linkedListStack.getSize());// 5

        System.out.println(linkedListStack.isEmpty());// false

        System.out.println(linkedListStack.pop());// 0
        System.out.println(linkedListStack);// Stack: top 1->2->3->4->NULL

        System.out.println(linkedListStack.peek());// 1
        System.out.println(linkedListStack);// Stack: top 1->2->3->4->NULL
    }
}
