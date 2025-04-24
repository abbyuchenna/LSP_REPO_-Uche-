package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of RandomNumberStrategy using Java's built-in Random class
 */
public class JavaBuiltInRandomStrategy implements RandomNumberStrategy {
    private final Random random;
    
    /**
     * Constructor initializes the Random object
     */
    public JavaBuiltInRandomStrategy() {
        this.random = new Random();
    }
    
    @Override
    public int generateRandomNumber() {
        // Next int returns both positive and negative, so we take absolute value
        return Math.abs(random.nextInt());
    }
}
//