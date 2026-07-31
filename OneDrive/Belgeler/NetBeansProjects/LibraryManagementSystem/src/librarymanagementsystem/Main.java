
package librarymanagementsystem;

import java.util.Scanner;


public class Main {
     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     Library library = new Library();

        int choice = 0;

        do {

            System.out.println("\n==============================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==============================");

            System.out.println("1 - Add Book");
            System.out.println("2 - List Books");
            System.out.println("3 - Search Book by ID");
            System.out.println("4 - Borrow Book");
            System.out.println("5 - Return Book");
            System.out.println("6 - Remove Book");
            System.out.println("7 - Search Book by Title");
            System.out.println("8 - Update Book");
            System.out.println("9 - List Available Books");
            System.out.println("10 - List Borrowed Books");
            System.out.println("11 - Library Statistics");
            System.out.println("0 - Exit");

            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {

    choice = scanner.nextInt();

} else {

    System.out.println(
            "Invalid input. Please enter a number."
    );

    scanner.nextLine();

    continue;
}

            switch (choice) {

                case 1:

                    scanner.nextLine();

                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    System.out.print(
        "Enter book ID: "
);

if (!scanner.hasNextInt()) {

    System.out.println(
            "Book ID must be a number."
    );

    scanner.nextLine();

    break;
}

int bookId = scanner.nextInt();
if (bookId <= 0) {

    System.out.println(
            "Book ID must be greater than zero."
    );

    break;
}

                    Book newBook = new Book(
                            title,
                            author,
                            bookId
                    );

                    library.addBook(newBook);

                    break;

                case 2:

                    library.listBooks();

                    break;

                case 3:

                    System.out.print(
        "Enter book ID: "
);

if (!scanner.hasNextInt()) {

    System.out.println(
            "Book ID must be a number."
    );

    scanner.nextLine();

    break;
}

int searchId =
        scanner.nextInt();

Book foundBook =
        library.searchBook(
                searchId
        );

                    if (foundBook == null) {

                        System.out.println(
                                "Book not found."
                        );

                    } else {

                        System.out.println(
                                "Book found:"
                        );

                        System.out.println(
                                foundBook
                        );
                    }

                    break;

                case 4:

    System.out.print(
            "Enter book ID: "
    );

    if (!scanner.hasNextInt()) {

        System.out.println(
                "Book ID must be a number."
        );

        scanner.nextLine();

        break;
    }

    int borrowId =
            scanner.nextInt();

    if (borrowId <= 0) {

        System.out.println(
                "Book ID must be greater than zero."
        );

        break;
    }

    library.borrowBook(
            borrowId
    );

    break;

                case 5:

    System.out.print(
            "Enter book ID: "
    );

    if (!scanner.hasNextInt()) {

        System.out.println(
                "Book ID must be a number."
        );

        scanner.nextLine();

        break;
    }

    int returnId =
            scanner.nextInt();

    if (returnId <= 0) {

        System.out.println(
                "Book ID must be greater than zero."
        );

        break;
    }

    library.returnBook(
            returnId
    );

    break;
                    case 6:

    System.out.print(
            "Enter book ID: "
    );

    if (!scanner.hasNextInt()) {

        System.out.println(
                "Book ID must be a number."
        );

        scanner.nextLine();

        break;
    }

    int removeId =
            scanner.nextInt();

    if (removeId <= 0) {

        System.out.println(
                "Book ID must be greater than zero."
        );

        break;
    }

    library.removeBook(
            removeId
    );

    break;
    
    case 7:

    scanner.nextLine();

    System.out.print(
            "Enter book title: "
    );

    String searchTitle =
        scanner.nextLine();

library.searchBookByTitle(
        searchTitle
);

    break;
    case 8:

    System.out.print(
            "Enter book ID: "
    );

    if (!scanner.hasNextInt()) {

        System.out.println(
                "Book ID must be a number."
        );

        scanner.nextLine();

        break;
    }

    int updateId =
            scanner.nextInt();

    if (updateId <= 0) {

        System.out.println(
                "Book ID must be greater than zero."
        );

        break;
    }

    scanner.nextLine();

    System.out.print(
            "Enter new book title: "
    );

    String newTitle =
            scanner.nextLine();

    System.out.print(
            "Enter new author name: "
    );

    String newAuthor =
            scanner.nextLine();

    library.updateBook(
            updateId,
            newTitle,
            newAuthor
    );

    break;
    case 9:

    library.listAvailableBooks();

    break;
    case 10:

    library.listBorrowedBooks();

    break;
    case 11:

    library.showStatistics();

    break;
    

                case 0:

                    System.out.println(
                            "Program is closing..."
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 0);

        scanner.close();
    }
  }   
     
     
    

