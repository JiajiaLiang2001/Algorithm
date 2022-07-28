public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
        }
        System.out.println(linkedList);

        linkedList.remove(3);// 4->3->2->0->NULL
        System.out.println(linkedList);

        linkedList.removeFirst();// 3->2->0->NULL
        System.out.println(linkedList);

        linkedList.removeLast();// 3->2->NULL
        System.out.println(linkedList);
    }
}
