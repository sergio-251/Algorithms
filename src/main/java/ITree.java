public interface ITree<E> extends linkedList.IFactory<E> {

    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }

    boolean find(E value);

    boolean add(E value);

    boolean remove(E value);

    void display();

    boolean isBalanced(Node node);

    void traverse(TraverseMode mode);
}
