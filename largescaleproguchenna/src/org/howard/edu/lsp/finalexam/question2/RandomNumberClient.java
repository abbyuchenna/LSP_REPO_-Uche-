package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program that demonstrates the use of RandomNumberService with different strategies
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        // Get the singleton instance of the service
        RandomNumberService service = RandomNumberService.getInstance();
        
        // Use Java built-in random strategy
        service.setStrategy(new JavaBuiltInRandomStrategy());
        System.out.println("Random number using Java built-in: " + service.generateRandomNumber());
        
        // Use Linear Congruential strategy
        service.setStrategy(new LinearCongruentialStrategy());
        System.out.println("Random number using Linear Congruential: " + service.generateRandomNumber());
        
        // Generate another number with each strategy to show they're different
        service.setStrategy(new JavaBuiltInRandomStrategy());
        System.out.println("Another number using Java built-in: " + service.generateRandomNumber());
        
        service.setStrategy(new LinearCongruentialStrategy());
        System.out.println("Another number using Linear Congruential: " + service.generateRandomNumber());
    }
}