package dequeData;

import queueData.MyQueue;
import stackData.MyStack;

public class MyDeque<E> extends MyQueue<E> implements IDeque<E> {

    private MyStack myStack;
    private MyQueue myQueue;
    private E[] data;
    private static final int DEFAULT_TAIL = -1;
    private static final int DEFAULT_HEAD = 0;
    private int currentSize;
    private int tail;
    private int head;

    public MyDeque(int n) {
        this.tail = DEFAULT_TAIL;
        this.head = DEFAULT_HEAD;
        myStack = new MyStack(n);
        myQueue = new MyQueue(n);
        this.data = (E[]) new Object[n];
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (head == this.data.length) {
            head = DEFAULT_HEAD;
        }
        this.data[++head] = value;
        tail = head - 1;
        currentSize++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        return insert(value);
    }

    @Override
    public E removeLeft() {
        return remove();
    }

    @Override
    public E removeRight() {
        E out;
        if (isEmpty()) {
            return null;
        }
        if (tail == data.length - 1) {
            tail = DEFAULT_TAIL;
        }
        System.out.println(head);
        out = data[tail++];
        currentSize--;
        return out;
    }

    @Override
    public boolean insert(E value) {
       boolean out = super.insert(value);
       tail = head - 1;
       return out;
    }

    @Override
    public E remove() {
        return super.remove();
    }

    @Override
    public E peekFront() {
        return super.peekFront();
    }

    @Override
    public boolean push(E value) {
        return false;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return peekFront();
    }

    @Override
    public int getCurrentSize() {
        return super.getCurrentSize();
    }

    @Override
    public boolean isFull() {
        return super.isFull();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
