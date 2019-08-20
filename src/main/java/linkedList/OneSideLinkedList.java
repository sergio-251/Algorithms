package linkedList;

import java.util.Iterator;

public class OneSideLinkedList<E> implements ILinkedList<E> {
    protected Node<E> firstElement;
    protected int currentSize;

    public void insertFirst(E value) {
        Node<E> node = new Node<>(value);//005
        node.next = firstElement;
        firstElement = node;
        currentSize++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;

        E value = firstElement.value;
        firstElement = firstElement.next;

        currentSize--;
        return value;
    }

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
        else if (current == firstElement) {
            firstElement = current.next;
        }
        else {
            previous.next = current.next;
        }

        currentSize--;

        return true;
    }

    public boolean contains(E value) {
        Node<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        System.out.println("----------");
        Node<E> current = firstElement;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("----------");
    }

    @Override
    public E getFirstValue() {
        return firstElement != null ? firstElement.value : null;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        return ILinkedList.super.isFull();
    }

    @Override
    public Node<E> getFirst() {
        return firstElement;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = firstElement;

            @SuppressWarnings("RedundantConditionalExpression")
            @Override
            public boolean hasNext() {
                return current == null ? false : true;
            }

            @Override
            public E next() {
                E result = current.value;
                if (!hasNext()) {
                   return null;
                }
                current = current.next;
                return result;
            }

        };
    }
}
