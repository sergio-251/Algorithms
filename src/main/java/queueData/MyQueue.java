package queueData;

public class MyQueue<E> implements IQueue<E> {
    private static final int DEFAULT_SIZE = 100;
    private static final int DEFAULT_TAIL = -1;
    private static final int DEFAULT_HEAD = 0;
    private final E[] data;
    private int currentSize;
    private int tail;
    private int head;

    public MyQueue() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public MyQueue(int n) {
        this.tail = DEFAULT_TAIL;
        this.head = DEFAULT_HEAD;
        this.data = (E[]) new Object[n];
    }

    public boolean insert(E value) {
        if (isFull()) {
            return false;
        }
        if (tail == this.data.length - 1) {
            tail = DEFAULT_TAIL;
        }
        this.data[++tail] = value;
        currentSize++;
        return true;
    }

    public E remove() {
        if (isEmpty()) {
            return null;
        }
        if (head == data.length) {
            head = DEFAULT_HEAD;
        }

        E out = data[head++];
        currentSize--;
        return out;
    }

    public E peekFront() {
        return data[head];
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isFull() {
        return currentSize == data.length;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }



}
