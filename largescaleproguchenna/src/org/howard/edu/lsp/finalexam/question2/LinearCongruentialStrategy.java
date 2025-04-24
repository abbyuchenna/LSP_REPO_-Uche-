package org.howard.edu.lsp.finalexam.question2;

/**
 * Implementation of RandomNumberStrategy using Linear Congruential Generator algorithm
 */
public class LinearCongruentialStrategy implements RandomNumberStrategy {
    private long seed;
    private final long a = 1664525;
    private final long c = 1013904223;
    private final long m = (long) Math.pow(2, 32);
    
    /**
     * Constructor initializes the seed with current time
     */
    public LinearCongruentialStrategy() {
        this.seed = System.currentTimeMillis();
    }
    
    @Override
    public int generateRandomNumber() {
        seed = (a * seed + c) % m;
        return (int) Math.abs(seed);
    }
}