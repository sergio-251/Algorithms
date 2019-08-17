package stackData;

public class MyStack<E> implements IStack<E>{
    private static final int DEFAULT_SIZE = 100;
    private E[] data;
    private int currentSize;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public MyStack(int n) {
        this.data = (E[]) new Object[n];
    }

    public boolean push(E value) {
        if (isFull()) {
            return false;
        }
        this.data[currentSize++] = value;
        return true;
    }

    public E pop() {
       return isEmpty() ? null : data[--currentSize];
    }

    public E peek() {
        return data[currentSize - 1];
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
