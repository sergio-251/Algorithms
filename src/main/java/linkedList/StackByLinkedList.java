package linkedList;

public class StackByLinkedList<E> implements IStack<E> {
    private OneSideLinkedList<E> data;

    public StackByLinkedList() {
        this.data = new OneSideLinkedList<>();
    }

    @Override
    public boolean push(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirstValue();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int getCurrentSize() {
        return data.currentSize;
    }

    @Override
    public boolean isFull() {
        return data.isFull();
    }
}
