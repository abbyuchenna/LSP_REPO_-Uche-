package org.howard.edu.lsp.assignment5.doc;

/**
 * driver class to test the IntegerSet functionalitie.
 */
public class Driver {
    /**
     * main method to run the program
     * @param args command line arguments
     */
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("value of set1 is: " + set1.toString());
        System.out.println("smallest value in set1 is: " + set1.smallest());
        System.out.println("largest value in set1 is: " + set1.largest());

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("union of set1 and set2");
        System.out.println("value of set1 is: " + set1.toString());
        System.out.println("value of set2 is: " + set2.toString());
        set1.union(set2); // union of set1 and set2
        System.out.println("result of union of set1 and set2");
        System.out.println(set1.toString()); // result of union of set1 and set2
    }
}

