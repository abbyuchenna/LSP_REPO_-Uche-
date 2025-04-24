package org.howard.edu.lsp.assignment6.doc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicSetOperationsTest {

    private IntegerSet set1;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
    }

    @Test
    public void testAdd() {
        // adds elements to set1 and checks if they are present
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertEquals(2, set1.length());
    }

    @Test
    public void testRemove() {
        // removes element from set1 and verifies it’s no longer present
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    public void testClear() {
        // clears set1 and checks if it’s empty
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    public void testLength() {
        // checks the length of set1 as elements are added
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
        set1.add(3);
        assertEquals(3, set1.length());
    }

    @Test
    public void testContains() {
        // verifies if set1 contains specific elements
        set1.add(1);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    public void testIsEmpty() {
        // checks if set1 is empty initially and after adding elements
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }

    @Test
    public void testToString() {
        // tests the string representation of set1
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString());
    }
}


