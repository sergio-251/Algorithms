import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

    MyArray mainArray;

    @Before
    public void start() {
        mainArray = new MyArray(50);
        mainArray.add(4);
        mainArray.add(-5);
        mainArray.add(0);
        mainArray.add(1);
        mainArray.add(13);
    }

    @Test
    public void test1() {
        Assert.assertEquals(3, mainArray.indexOfValue(1));
    }

    @Test
    public void test2() {
        Assert.assertEquals(-1, mainArray.indexOfValue(5));
    }

    @Test
    public void test3() {
        Assert.assertEquals(-5, mainArray.valueOfIndex(1));
    }

    @Test
    public void test4() {
        Assert.assertEquals(50, mainArray.length());
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, mainArray.getCurrentSize());
    }




    @After
    public void end(){}
}
