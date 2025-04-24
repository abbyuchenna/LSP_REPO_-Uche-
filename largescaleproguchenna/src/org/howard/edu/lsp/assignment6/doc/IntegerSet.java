package org.howard.edu.lsp.assignment6.doc;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    private List<Integer> set = new ArrayList<Integer>();

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    // Returns true if the 2 sets are equal, false otherwise
    public boolean equals(IntegerSet b) {
        return set.containsAll(b.set) && b.set.containsAll(set);
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; throws IntegerSetException if the set is empty
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty.");
        }
        return set.stream().max(Integer::compareTo).orElseThrow();
    }

    // Returns the smallest item in the set; throws IntegerSetException if the set is empty
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty.");
        }
        return set.stream().min(Integer::compareTo).orElseThrow();
    }

    // Adds an item to the set or does nothing if it already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // set union
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    // set intersection
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // set difference, i.e., s1 - s2
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // set complement, all elements not in s1
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i) && intSetb.set.contains(i)) {
                complementSet.add(i);
            }
        }
        set = complementSet;
    }

    // returns true if the set is empty false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // return string representation of the set
    public String toString() {
        return set.toString();
    }
}
