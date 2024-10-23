package org.howard.edu.lsp.assignment5.doc;

/**
 * the driver class is used to test the integerset class.
 * it demostrates the functionality of each method in integerset.
 */
public class Driver {
    public static void main(String[] args) {
        // create first integerset
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("value of set1 is: " + set1.toString());
        System.out.println("smallest value in set1 is: " + set1.smallest());
        System.out.println("largest value in set1 is: " + set1.largest());

        // create second integerset
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("union of set1 and set2");
        System.out.println("value of set1 is: " + set1.toString()); // set1: [1,2,3]
        System.out.println("value of set2 is: " + set2.toString()); // set2: [3,4,5]
        set1.union(set2); // union of set1 and set2
        System.out.println("result of union of set1 and set2");
        System.out.println(set1.toString()); // result of union of set1 and set2
    }
}
