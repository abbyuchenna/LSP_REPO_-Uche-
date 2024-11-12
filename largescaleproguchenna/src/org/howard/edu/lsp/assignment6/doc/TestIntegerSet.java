package org.howard.edu.lsp.assignment6.doc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestIntegerSet {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    public void testAdd() {
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertEquals(2, set1.length());
    }

    @Test
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    public void testLength() {
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
        set1.add(3);
        assertEquals(3, set1.length());
    }

    @Test
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        assertTrue(set1.equals(set2));
        set2.add(3);
        assertFalse(set1.equals(set2));
    }

    @Test
    public void testContains() {
        set1.add(1);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    public void testLargest() throws IntegerSetException {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest());
    }

    @Test
    public void testLargestException() {
        assertThrows(IntegerSetException.class, () -> {
            set1.largest();
        });
    }

    @Test
    public void testSmallest() throws IntegerSetException {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest());
    }

    @Test
    public void testSmallestException() {
        assertThrows(IntegerSetException.class, () -> {
            set1.smallest();
        });
    }

    @Test
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));


