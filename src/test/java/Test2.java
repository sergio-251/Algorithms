import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import queueData.MyQueue;


public class Test2 {
    MyQueue<Integer> myQueue;

    @Before
    public void start() {
        myQueue = new MyQueue<>(4);
        myQueue.insert(-4);
        myQueue.insert(0);
        myQueue.insert(8);
        myQueue.insert(12);
        myQueue.insert(-7);
    }


    @Test
    public void test1() {
        Assert.assertEquals(4, myQueue.getCurrentSize());
    }


    @Test
    public void test2() {
        Assert.assertEquals(-4, (int) myQueue.peekFront());
    }

    @Test
    public void test3() {
        Assert.assertEquals(-4, (int)myQueue.remove());
    }



}
