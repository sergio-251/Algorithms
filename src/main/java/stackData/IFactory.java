package stackData;

public interface IFactory<E> {
    int getCurrentSize();
    boolean isFull();
    boolean isEmpty();
}
