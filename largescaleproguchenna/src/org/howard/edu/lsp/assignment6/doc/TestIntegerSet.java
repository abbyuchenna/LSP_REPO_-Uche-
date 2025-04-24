package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestIntegerSet {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        // initialize two empty integer sets before each test
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    public void testAdd() {
        // test adding elements to the set
        set1.add(1);
        set1.add(2);
        assertTrue(set1.contains(1)); // check if 1 is in the set
        assertTrue(set1.contains(2)); // check if 2 is in the set
        assertEquals(2, set1.length()); // check if length of the set is 2
    }

    @Test
    public void testRemove() {
        // test removing an element from the set
        set1.add(1);
        set1.add(2);
        set1.remove(1);
        assertFalse(set1.contains(1)); // check if 1 has been removed
        assertTrue(set1.contains(2)); // check if 2 is still in the set
    }

    @Test
    public void testClear() {
        // test clearing all elements from the set
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertTrue(set1.isEmpty()); // check if the set is empty after clear
    }

    @Test
    public void testLength() {
        // test getting the length of the set
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length()); // check if length is 2
        set1.add(3);
        assertEquals(3, set1.length()); // check if length is 3 after adding another element
    }

    @Test
    public void testEquals() {
        // test if two sets are equal
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        assertTrue(set1.equals(set2)); // check if sets are equal
        set2.add(3);
        assertFalse(set1.equals(set2)); // check if sets are not equal after adding an element to set2
    }

    @Test
    public void testContains() {
        // test if the set contains a specific element
        set1.add(1);
        assertTrue(set1.contains(1)); // check if set contains 1
        assertFalse(set1.contains(2)); // check if set does not contain 2
    }

    @Test
    public void testLargest() throws IntegerSetException {
        // test finding the largest element in the set
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest()); // check if largest element is 3
    }

    @Test
    public void testLargestException() {
        // test if largest() throws an exception when set is empty
        assertThrows(IntegerSetException.class, () -> {
            set1.largest();
        });
    }

    @Test
    public void testSmallest() throws IntegerSetException {
        // test finding the smallest element in the set
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest()); // check if smallest element is 1
    }

    @Test
    public void testSmallestException() {
        // test if smallest() throws an exception when set is empty
        assertThrows(IntegerSetException.class, () -> {
            set1.smallest();
        });
    }

    @Test
    public void testUnion() {
        // test union of two sets
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.union(set2);
        assertTrue(set1.contains(1)); // check if set1 contains 1
        assertTrue(set1.contains(2)); // check if set1 contains 2
        assertTrue(set1.contains(3)); // check if set1 contains 3
        assertTrue(set1.contains(4)); // check if set1 contains 4
    }

    @Test
    public void testIntersect() {
        // test intersection of two sets
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2)); // check if intersection contains 2
        assertFalse(set1.contains(1)); // check if intersection does not contain 1
        assertFalse(set1.contains(3)); // check if intersection does not contain 3
    }

    @Test
    public void testDiff() {
        // test difference of two sets
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1)); // check if difference contains 1
        assertFalse(set1.contains(2)); // check if difference does not contain 2
        assertFalse(set1.contains(3)); // check if difference does not contain 3
    }

    @Test
    public void testIsEmpty() {
        // test if the set is empty
        assertTrue(set1.isEmpty()); // check if new set is empty
        set1.add(1);
        assertFalse(set1.isEmpty()); // check if set is not empty after adding an element
    }

    @Test
    public void testToString() {
        // test string representation of the set
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString()); // check if toString outputs "[1, 2]"
    }
}
