
package librarymanagementsystem;


public class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean isBorrowed;
    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isBorrowed = false;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
    this.title = title;
}

public void setAuthor(String author) {
    this.author = author;
}

    public int getBookId() {
        return bookId;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
    this.isBorrowed = isBorrowed;
}

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {

        String status;

        if (isBorrowed) {
            status = "Borrowed";
        } else {
            status = "Available";
        }

        return "Book ID: " + bookId
                + " | Title: " + title
                + " | Author: " + author
                + " | Status: " + status;
    }
}
