public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack() {
        array = new Array<>();
    }

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * Get stack size
     *
     * @return
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * Is the stack empty
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    /**
     * Push onto the stack
     *
     * @param e
     */
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    /**
     * Pop onto the stack
     *
     * @return
     */
    @Override
    public E pop() {
        return array.removeLast();
    }

    /**
     * Remove the top element from the stack
     *
     * @return
     */
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }
}
