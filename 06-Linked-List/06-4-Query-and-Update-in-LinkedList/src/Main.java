public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
        }
        System.out.println(linkedList);// 4->3->2->1->0->NULL

        // add
        linkedList.add(2, 111);// 4->3->111->2->1->0->NULL
        System.out.println(linkedList);
        // addFirst addLast
        linkedList.addFirst(222);// 222->4->3->111->2->1->0->NULL
        System.out.println(linkedList);
        linkedList.addLast(333);// 222->4->3->111->2->1->0->333->NULL
        System.out.println(linkedList);

        // get
        System.out.println(linkedList.get(4));// 2
        // getFirst getLast
        System.out.println(linkedList.getFirst());// 222
        System.out.println(linkedList.getLast());// 333

        // set
        linkedList.set(2, 666);// 222->4->666->111->2->1->0->333->NULL
        System.out.println(linkedList);

        // contains
        System.out.println(linkedList.contains(777));// false
    }
}
