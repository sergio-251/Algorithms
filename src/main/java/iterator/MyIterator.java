package iterator;

import linkedList.ILinkedList;
import linkedList.OneSideLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {
    public static void main(String[] args) {

        OneSideLinkedList<Integer> linkedList = createLinkedList();

        System.out.println("Задание 3 - перебор элементов списка с помошью forEach : ");
        for (Integer o : linkedList) {
            doAction(o);
        }
        System.out.println("----------");
        System.out.println("\"Обычный\" обход связанного списка с помощью while : ");
       ILinkedList.Node<Integer> current = linkedList.getFirst();
        while (current != null) {
            Integer value = current.value;
            doAction(value);
            current = current.next;
        }

        System.out.println("----------");
    }

    private static OneSideLinkedList<Integer> createLinkedList() {
        OneSideLinkedList<Integer> linkedList = new OneSideLinkedList<>();
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(1);
        linkedList.insertFirst(-5);
        linkedList.insertFirst(0);
        return linkedList;
    }

    private static void doAction(int value) {
        System.out.println(value);
    }
}
