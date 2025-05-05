package org.howard.edu.lspfinal.question3;

/**
 * Abstract template for report generation
 */
public abstract class Report {
    // Template method (final to prevent overriding)
    public final void generate() {
        loadData();
        formatData();
        display();
    }
    
    // Steps to be implemented by subclasses
    protected abstract void loadData();
    protected abstract void formatData();
    protected abstract void display();
}