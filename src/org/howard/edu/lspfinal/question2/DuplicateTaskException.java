package org.howard.edu.lspfinal.question2;

/**
 * Custom exception for duplicate task entries
 */
public class DuplicateTaskException extends Exception {
    public DuplicateTaskException(String message) {
        super(message);
    }
}