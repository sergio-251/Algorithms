package stackData;

public interface IStack<E> extends IFactory<E> {

    boolean push(E value);
    E pop();
    E peek();

}
