package deqo.agai.simpleStack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

public class ItemTest {
    private Item it;
    private Object obj1, obj2;

    @Before
    public void setUp() {
        obj1 = new String("ok");
        obj2 = new Float(2.4);
    }

    @Test
    public void getObjet() throws Exception {
        it = new Item(obj1);
        assertThat(it.getObjet(), sameInstance(obj1));
    }

    @Test
    public void setObjet() throws Exception {
        it = new Item(obj1);
        it.setObjet(obj2);
        assertThat(it.getObjet(), sameInstance(obj2));
    }
}