package linkedList;

public interface IQueue<E> extends IFactory<E> {
    boolean insert(E value);
    E remove();
    E peek();
}
