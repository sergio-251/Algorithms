package linkedList;

public class TwoSideLinkedList<E> extends OneSideLinkedList<E> implements ITwoSideLinkedList<E> {
    private Node<E> lastElement;

    //O(1)
    @Override
    public void insertLast(E value) {
        Node<E> node = new Node<>(value);

        if (isEmpty()) {
            firstElement = node;
        }
        else {
            lastElement.next = node;
        }
        lastElement = node;
        currentSize++;
    }

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (currentSize == 1) {
            lastElement = firstElement;
        }
    }

    @Override
    public E removeFirst() {
        E value = super.removeFirst();
        if (isEmpty()) {
            lastElement = null;
        }
        return value;
    }

    @Override
    public boolean remove(E value) {
        Node<E> previous = null;
        Node<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }

            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }
        else if (current == firstElement && current == lastElement) {
            firstElement = null;
            lastElement = null;
        }
        else if (current == firstElement) {
            firstElement = current.next;
        }
        else if (current == lastElement) {
            lastElement = previous;
            lastElement.next = null;
        }
        else {
            previous.next = current.next;
        }

        currentSize--;

        return true;
    }
}
