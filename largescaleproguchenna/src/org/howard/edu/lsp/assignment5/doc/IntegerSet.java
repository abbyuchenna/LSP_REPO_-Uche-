package org.howard.edu.lsp.assignment5.doc;

import java.util.ArrayList;
import java.util.List;

/**
 * the integerset clas represnts a collection of unique integers.
 * it provides methods to perform set oeratons and manage the integer elemnts.
 */
public class IntegerSet {
    // store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    // default constructor
    public IntegerSet() {
    }

    /**
     * constructs an integerset with the provided list of integers.
     * @param set the list of integers to initalze the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * clears the internal represntation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * returns the length of the set.
     * @return the number of elemnts in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * checks if this set is equal to another object.
     * @param o the object to compare with.
     * @return true if the sets are equal, false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet otherSet = (IntegerSet) o;
        return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
    }

    /**
     * checks if the set contains a specific value.
     * @param value the integer value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * returns the largest item in the set.
     * @return the largest integer in the set.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("set is empty");
        }
        return set.stream().max(Integer::compare).orElseThrow();
    }

    /**
     * returns the smallest item in the set.
     * @return the smallest integer in the set.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("set is empty");
        }
        return set.stream().min(Integer::compare).orElseThrow();
    }

    /**
     * adds an item to the set if it is not already present
     * @param item the integer to be added to the set
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * removes an item from the set if it is present.
     * @param item the integer to be removed from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * performs the union of this set with another set.
     * @param intSetb the other integerset to union with
     */
    public void union(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            this.add(item);
        }
    }

    /**
     * performs the intersection of this set w another set
     * @param intSetb the other integerset to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * performs the difference of this set from another set.
     * @param intSetb the other integerset to diff from.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * returns the complement of this set compared to another set.
     * @param intSetb the other integerset to compare against.
     */
    public void complement(IntegerSet intSetb) {
        for (Integer item : intSetb.set) {
            this.remove(item);
        }
    }

    /**
     * checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * returns a string represntation of the set.
     * @return a string of all elemnts in the set.
     */
    public String toString() {
        return set.toString();
    }
}
