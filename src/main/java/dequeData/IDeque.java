package dequeData;

import queueData.IQueue;
import stackData.IStack;

public interface IDeque<E> extends IStack<E>, IQueue<E> {
    boolean insertLeft(E value);
    boolean insertRight(E value);
    E removeLeft();
    E removeRight();
}
