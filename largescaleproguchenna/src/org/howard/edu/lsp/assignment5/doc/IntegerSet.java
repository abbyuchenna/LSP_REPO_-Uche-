package org.howard.edu.lsp.assignment5.doc;

import java.util.ArrayList;
import java.util.List;

/**
 * represents a set of integers.
 */
public class IntegerSet {
    // store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    // default constructor
    /**
     * creates a new integer set.
     */
    public IntegerSet() {
    }

    // constructor if you want to pass in already initialized
    /**
     * creates an integer set with the specified elements.
     * @param set initial elements for the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // clears the internal representation of the set
    /**
     * clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    // returns the length of the set.
    /**
     * returns the number of elements in the set.
     * @return length of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * returns true if the two sets are equal, false otherwise.
     * two sets are equal if they contain all of the same values in any order.
     * @param o the object to compare with
     * @return true if equal, false otherwis
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        return set.containsAll(other.set) && other.set.containsAll(set);
    }

    // returns true if the set contains the value, otherwise false.
    /**
     * checks if the set contains the specified value.
     * @param value the integer value to check
     * @return true if value is in the set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    // returns the largest item in the set.
    /**
     * returns the largest integer in the set.
     * @return largest integer in the set
     */
    public int largest() {
        return set.stream().max(Integer::compareTo).orElseThrow();
    }

    // returns the smallest item in the set.
    /**
     * returns the smallest integer in the set.
     * @return smallest integer in the set
     */
    public int smallest() {
        return set.stream().min(Integer::compareTo).orElseThrow();
    }

    // adds an item to the set or does nothing if already there.
    /**
     * adds an item to the set if it is not already present.
     * @param item the integer to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // removes an item from the set or does nothing if not there.
    /**
     * removes the specified item from the set if it exists.
     * @param item the integer to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // set union.
    /**
     * performs the union of this set with another set.
     * @param intSetb the other integer set
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    // set intersection, all elements in s1 and s2.
    /**
     * performs the intersection of this set with another set.
     * @param intSetb the other integer set
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // set difference, i.e., s1 - s2.
    /**
     * performs the difference of this set from another set.
     * @param intSetb the other integer set
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // set complement, all elements not in s1.
    /**
     * performs the complement operation with respect to another set.
     * @param intSetb the other integer set
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i) && !intSetb.set.contains(i)) {
                complementSet.add(i);
            }
        }
        set = complementSet;
    }

    // returns true if the set is empty, false otherwise.
    /**
     * checks if the set is empty.
     * @return true if set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // return String representation of your set
    /**
     * returns a string representation of the set
     * @return string representation of the set
     */
    public String toString() {
        return set.toString();
    }
}

