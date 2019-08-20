package linkedList;

public class QueueByLinkedList<E> implements IQueue<E> {
    private TwoSideLinkedList<E> data;

    public QueueByLinkedList() {
        this.data = new TwoSideLinkedList<>();
    }

    @Override
    public boolean insert(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E remove() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.getFirstValue();
    }

    @Override
    public int getCurrentSize() {
        return data.currentSize;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return data.isFull();
    }
}
