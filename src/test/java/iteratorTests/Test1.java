package iteratorTests;

import iterator.LinkInterator;
import iterator.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Test1 {

    LinkedList list;

    @Before
    public void start() {
        list = new LinkedList();
        LinkInterator itr = new LinkInterator(list);
        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);
        itr.insertBefore("Alex", 38);

    }

    @Test
    public void test1() {
        list.display();
    }

    @After
    public void end(){}
}
