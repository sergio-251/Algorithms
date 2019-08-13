import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Test2 {
    MyArray mainArray;

    @Before
    public void start() {
        mainArray = new MyArray();
        mainArray.randomGenerate(-60);
    }


    @Test
    public void test1() {
        Assert.assertEquals(-1, mainArray.indexOfValue(5));
    }


    @Test
    public void test2() {
        Assert.assertEquals(1000000, mainArray.length());
    }

    @Test
    public void test3() {
        Assert.assertEquals(1000000, mainArray.getCurrentSize());
    }



}
