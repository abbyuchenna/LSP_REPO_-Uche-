package org.howard.edu.lsp.assignment6.doc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdvancedSetOperationsTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    public void testEquals() {
        // tests if set1 and set2 are equal based on elements
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        assertTrue(set1.equals(set2));
        set2.add(3);
        assertFalse(set1.equals(set2));
    }

    @Test
    public void testLargest() throws IntegerSetException {
        // checks if the largest element in set1 is returned correctly
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest());
    }

    @Test
    public void testLargestException() {
        // expects an exception when attempting to find largest in an empty set
        assertThrows(IntegerSetException.class, () -> {
            set1.largest();
        });
    }

    @Test
    public void testSmallest() throws IntegerSetException {
        // checks if the smallest element in set1 is returned correctly
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest());
    }

    @Test
    public void testSmallestException() {
        // expects an exception when attempting to find smallest in an empty set
        assertThrows(IntegerSetException.class, () -> {
            set1.smallest();
        });
    }

    @Test
    public void testUnion() {
        // performs union of set1 and set2 and checks for containment of all elements
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(4));
    }

    @Test
    public void testIntersect() {
        // performs intersection of set1 and set2 and checks for common elements
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(1));
        assertFalse(set1.contains(3));
    }

    @Test
    public void testDiff() {
        // performs difference of set1 and set2 and checks for unique elements in set1
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
    }
}
