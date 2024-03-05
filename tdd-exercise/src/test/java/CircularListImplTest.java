import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
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

    @BeforeEach
    void testsetCircularList() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        circularList.setCircularList(testList);
        assertEquals(testList, circularList.getCircularList());
    }

   

   

    @Test
    void testIsEmpty() {
        assertEquals(false, circularList.isEmpty());
        circularList.reset();
        assertEquals(true, circularList.isEmpty());
    }

    @Test
    void testReset() {
        circularList.reset();
        assertEquals(Collections.emptyList(), circularList.getCircularList());
    }

    @Test
    void testSize() {
        assertEquals(3, circularList.size());
    }

    @Test
    void testAdd() {
        int element = 42;
        circularList.add(element);
        assertEquals(4,circularList.size() );
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(42);
        assertEquals(testList, circularList.getCircularList());
    }

    @Test
    void testBackwardIterator() {
        assertThrows(IndexOutOfBoundsException.class, () -> circularList.backwardIterator());
        //assertEquals("1", circularList.backwardIterator());
    }

    @Test
    void testForwardIterator() {
        //assertThrows(IndexOutOfBoundsException.class, () -> circularList.forwardIterator());
        assertEquals(Integer.valueOf(1), circularList.forwardIterator());
    }







}
