package org.howard.edu.lsp.midterm.question1;
/**
 * represents a book with attributes like title, author, ISBN, and year published.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * constructs a new book object with the given title, author, ISBN, and year published.
     * 
     * @param title the title of the book
     * @param author the author of the book
     * @param ISBN the ISBN number of the book (unique identifier)
     * @param yearPublished the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * returns the title of the book.
     * 
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * sets the title of the book.
     * 
     * @param title the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * returns the author of the book.
     * 
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * sets the author of the book.
     * 
     * @param author the author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * returns the ISBN of the book.
     * 
     * @return the ISBN of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * sets the ISBN of the book.
     * 
     * @param ISBN the ISBN of the book
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * returns the year the book was published.
     * 
     * @return the year published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * sets the year the book was published.
     * 
     * @param yearPublished the year published
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * compares two book objects based on ISBN and author.
     * 
     * @param obj the object to compare to
     * @return true if the ISBN and author are the same, otherwise false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    /**
     * returns a string representation of the book object.
     * 
     * @return a string containing the title, author, ISBN, and year published
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}