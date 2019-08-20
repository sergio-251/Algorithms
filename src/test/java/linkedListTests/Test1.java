package linkedListTests;

import linkedList.ILinkedList;
import linkedList.OneSideLinkedList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Test1 {

    ILinkedList<Integer> myLinkedList;

    @Before
    public void start() {
        myLinkedList = new OneSideLinkedList<>();
        myLinkedList.insertFirst(4);
        myLinkedList.insertFirst(-5);
        myLinkedList.insertFirst(0);
        myLinkedList.insertFirst(1);
        myLinkedList.insertFirst(13);
        myLinkedList.insertFirst(-7);
    }

    @Test
    public void test1() {
        Assert.assertEquals(6, myLinkedList.getCurrentSize());
    }

    @Test
    public void test2() {
        Assert.assertEquals(-7, (int) myLinkedList.removeFirst());
    }

    @Test
    public void test3() {
        myLinkedList.removeFirst();
        Assert.assertEquals(13, (int) myLinkedList.getFirstValue());
    }

    @Test
    public void test4() {
        myLinkedList.removeFirst();
        Assert.assertEquals(5, myLinkedList.getCurrentSize());
    }

    @After
    public void end(){}
}
