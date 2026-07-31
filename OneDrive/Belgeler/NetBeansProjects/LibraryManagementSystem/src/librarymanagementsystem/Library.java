package librarymanagementsystem;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Library {

    private ArrayList<Book> books;

    private final String FILE_NAME = "books.txt";

    public Library() {

        books = new ArrayList<>();

        loadBooksFromFile();
    }

    public void addBook(Book book) {

        Book existingBook =
                searchBook(book.getBookId());

        if (existingBook != null) {

            System.out.println(
                    "A book with this ID already exists."
            );

        } else {

            books.add(book);

            saveBooksToFile();

            System.out.println(
                    "Book added successfully."
            );
        }
    }

    public void listBooks() {

        if (books.isEmpty()) {

            System.out.println(
                    "There are no books in the library."
            );

            return;
        }

        System.out.println(
                "\n--- BOOK LIST ---"
        );

        for (Book book : books) {

            System.out.println(book);
        }
    }

    public Book searchBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                return book;
            }
        }

        return null;
    }

    public void borrowBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println(
                    "Book not found."
            );

        } else if (book.isBorrowed()) {

            System.out.println(
                    "This book is already borrowed."
            );

        } else {

            book.borrowBook();

            saveBooksToFile();

            System.out.println(
                    "Book borrowed successfully."
            );
        }
    }

    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println(
                    "Book not found."
            );

        } else if (!book.isBorrowed()) {

            System.out.println(
                    "This book has not been borrowed."
            );

        } else {

            book.returnBook();

            saveBooksToFile();

            System.out.println(
                    "Book returned successfully."
            );
        }
    }

    public void removeBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println(
                    "Book not found."
            );

        } else if (book.isBorrowed()) {

            System.out.println(
                    "Borrowed books cannot be removed."
            );

        } else {

            books.remove(book);

            saveBooksToFile();

            System.out.println(
                    "Book removed successfully."
            );
        }
    }

    public void searchBookByTitle(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle()
                    .toLowerCase()
                    .contains(title.toLowerCase())) {

                System.out.println(book);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No book found with this title."
            );
        }
    }

    private void saveBooksToFile() {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(FILE_NAME)
                    );

            for (Book book : books) {

                writer.write(
                        book.getBookId()
                        + ";"
                        + book.getTitle()
                        + ";"
                        + book.getAuthor()
                        + ";"
                        + book.isBorrowed()
                );

                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println(
                    "Books could not be saved."
            );
        }
    }

    private void loadBooksFromFile() {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(FILE_NAME)
                    );

            String line;

            while (
                    (line = reader.readLine())
                    != null
            ) {

                String[] information =
                        line.split(";");

                int bookId =
                        Integer.parseInt(
                                information[0]
                        );

                String title =
                        information[1];

                String author =
                        information[2];

                boolean isBorrowed =
                        Boolean.parseBoolean(
                                information[3]
                        );

                Book book =
                        new Book(
                                title,
                                author,
                                bookId
                        );

                book.setBorrowed(
                        isBorrowed
                );

                books.add(book);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    "No saved book file was found."
            );
        }
    }
    public void updateBook(
        int bookId,
        String newTitle,
        String newAuthor
) {

    Book book = searchBook(bookId);

    if (book == null) {

        System.out.println(
                "Book not found."
        );

    } else {

        book.setTitle(
                newTitle
        );

        book.setAuthor(
                newAuthor
        );

        saveBooksToFile();

        System.out.println(
                "Book updated successfully."
        );
    }
}
    public void listAvailableBooks() {

    boolean found = false;

    System.out.println(
            "\n--- AVAILABLE BOOKS ---"
    );

    for (Book book : books) {

        if (!book.isBorrowed()) {

            System.out.println(book);

            found = true;
        }
    }

    if (!found) {

        System.out.println(
                "There are no available books."
        );
    }
}
    public void listBorrowedBooks() {

    boolean found = false;

    System.out.println(
            "\n--- BORROWED BOOKS ---"
    );

    for (Book book : books) {

        if (book.isBorrowed()) {

            System.out.println(book);

            found = true;
        }
    }

    if (!found) {

        System.out.println(
                "There are no borrowed books."
        );
    }
}
    public void showStatistics() {

    int totalBooks = books.size();

    int availableBooks = 0;

    int borrowedBooks = 0;

    for (Book book : books) {

        if (book.isBorrowed()) {

            borrowedBooks++;

        } else {

            availableBooks++;
        }
    }

    System.out.println(
            "\n--- LIBRARY STATISTICS ---"
    );

    System.out.println(
            "Total Books: "
            + totalBooks
    );

    System.out.println(
            "Available Books: "
            + availableBooks
    );

    System.out.println(
            "Borrowed Books: "
            + borrowedBooks
    );
}
}