package linkedListTests;

import linkedList.ILinkedList;
import linkedList.TwoSideLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Test2 {
    TwoSideLinkedList<Integer> myLinkedList;

    @Before
    public void start() {
        myLinkedList = new TwoSideLinkedList<>();
        myLinkedList.insertFirst(3);
        myLinkedList.insertLast(-9);
        myLinkedList.insertFirst(0);
        myLinkedList.insertLast(-4);

    }


    @Test
    public void test1() {
        Assert.assertEquals(4, myLinkedList.getCurrentSize());
    }


    @Test
    public void test2() {
        Assert.assertEquals(0, (int) myLinkedList.getFirstValue());
    }

    @Test
    public void test3() {
        Assert.assertEquals(true, myLinkedList.remove(-9));
    }



}
