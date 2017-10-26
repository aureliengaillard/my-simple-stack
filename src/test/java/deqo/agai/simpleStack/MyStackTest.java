package deqo.agai.simpleStack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

public class MyStackTest {
    Item it1, it2, it3;
    SimpleStack stack;

    @Before
    public void setUp() throws Exception {
        it1 = new Item("it1");
        it2 = new Item("it2");
        it3 = new Item("it3");
        stack = new MyStack();
    }

    @Test
    public void isEmpty() throws Exception {
        assertThat(stack.isEmpty(), is(true));
        stack.push(it1);
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    public void getSize() throws Exception {
        assertThat(stack.getSize(), is(0));
        stack.push(it1);
        assertThat(stack.getSize(), is(1));
        stack.push(it2);
        assertThat(stack.getSize(), is(2));
    }

    @Test
    public void testPeekOK() throws Exception {
        stack.push(it1);
        stack.push(it2);
        final Item item = stack.peek();
        assertThat(item, sameInstance(it2));
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekException() {
        Item nothing = stack.peek();
    }

    @Test
    public void testPopOK() throws Exception {
        stack.push(it1);
        stack.push(it2);

        final Item actual2 = stack.pop();
        assertThat(actual2, sameInstance(it2));

        final Item actual1 = stack.pop();
        assertThat(actual1, sameInstance(it1));

        assertThat(stack.isEmpty(), is(true));
    }

    @Test(expected = EmptyStackException.class)
    public void testPopException() {
        Item nothing = stack.pop();
    }
}