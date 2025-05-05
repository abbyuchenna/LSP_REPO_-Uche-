package org.howard.edu.lspfinal.question2;

/**
 * Custom exception for missing tasks
 */
public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String message) {
        super(message);
    }
}