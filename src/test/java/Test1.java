import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import stackData.MyStack;

public class Test1 {

    MyStack<Integer> myStack;

    @Before
    public void start() {
        myStack = new MyStack<>(5);
        myStack.push(4);
        myStack.push(-5);
        myStack.push(0);
        myStack.push(1);
        myStack.push(13);
        myStack.push(-7);
    }

    @Test
    public void test1() {
        Assert.assertEquals(5, myStack.getCurrentSize());
    }

    @Test
    public void test2() {
        Assert.assertEquals(13, (int) myStack.pop());
    }

    @Test
    public void test3() {
        myStack.pop();
        Assert.assertEquals(1, (int)myStack.peek());
    }

    @Test
    public void test4() {
        myStack.pop();
        Assert.assertEquals(4, myStack.getCurrentSize());
    }

    @After
    public void end(){}
}
