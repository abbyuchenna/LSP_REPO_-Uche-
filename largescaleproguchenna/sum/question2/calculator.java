package org.howard.edu.lsp.midterm.question2;

/**
 * utility class that provides methods to sum numbers.
 * it supports summing two integers, two double values, or an array of integers.
 */
public class Calculator {

    /**
     * sums two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * sums two double values.
     * 
     * @param a the first double value
     * @param b the second double value
     * @return the sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * sums all elements in an array of integers.
     * 
     * @param numbers an array of integers to be summed
     * @return the sum of all the integers in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}}