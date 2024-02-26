import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.CircularListImpl;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListImplTest {
    private CircularListImpl circularList;

    

     @BeforeEach
    void beforeEach(){
        circularList = new CircularListImpl();
    }

    @Test
    void testIsEmpty() {
        assertEquals(true, circularList.isEmpty());
    }

    @Test
    void testReset() {
        assertEquals(Collections.emptyList(), circularList.getCircularList());
    }

    @Test
    void testSize() {
        assertEquals(0, circularList.size());
    }

    @Test
    void testAdd() {
        int element = 42;
        circularList.add(element);
        assertEquals(1,circularList.size() );
    }







}
