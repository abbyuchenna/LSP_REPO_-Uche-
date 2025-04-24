package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service for generating random numbers using different strategies
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;
    
    /**
     * Private constructor to prevent instantiation
     */
    private RandomNumberService() {
        // Default strategy
        this.strategy = new JavaBuiltInRandomStrategy();
    }
    
    /**
     * Gets the singleton instance of the service
     * @return the singleton instance
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }
    
    /**
     * Sets the strategy for random number generation
     * @param strategy the strategy to use
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }
    
    /**
     * Generates a random number using the current strategy
     * @return a positive random integer
     */
    public int generateRandomNumber() {
        return strategy.generateRandomNumber();
    }
}
//