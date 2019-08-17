package queueData;

import stackData.IFactory;

public interface IQueue<E> extends IFactory<E> {

    boolean insert(E value);
    E remove();
    E peekFront();

}
