# Library Management System

A console-based Library Management System developed using Java.

This application allows users to manage books, search for books, borrow and return books, update book information, and store book data in a text file.

## Features

* Add new books
* List all books
* Search books by ID
* Search books by title
* Borrow books
* Return borrowed books
* Remove books
* Update book information
* List available books
* List borrowed books
* Display library statistics
* Prevent duplicate book IDs
* Validate user input
* Save book data to a TXT file
* Load saved books when the application starts

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* File Handling
* BufferedReader
* BufferedWriter

## Project Structure

```text
LibraryManagementSystem
│
├── Book.java
├── Library.java
├── Main.java
├── books.txt
└── README.md
```

## Classes

### Book

The `Book` class stores information about a book.

Book properties:

* Book ID
* Title
* Author
* Borrowing status

### Library

The `Library` class manages all library operations.

It is responsible for:

* Adding books
* Searching for books
* Borrowing and returning books
* Removing and updating books
* Listing books
* Saving and loading book data

### Main

The `Main` class contains the main menu and handles user input.

## How to Run

1. Open the project in NetBeans.
2. Open the `Main.java` file.
3. Run the project using the `F6` key.
4. Select an option from the menu.

## Example Menu

```text
1 - Add Book
2 - List Books
3 - Search Book by ID
4 - Borrow Book
5 - Return Book
6 - Remove Book
7 - Search Book by Title
8 - Update Book
9 - List Available Books
10 - List Borrowed Books
11 - Library Statistics
0 - Exit
```

## Data Storage

Book information is stored in a file named `books.txt`.

Example:

```text
101;Java Programming;Herbert Schildt;false
102;Clean Code;Robert C. Martin;true
```

The last value represents the borrowing status:

* `false` → Available
* `true` → Borrowed

## Concepts Used

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Methods
* ArrayList
* Loops
* Conditional Statements
* Switch-Case
* Exception Handling
* File Operations

## Future Improvements

* Add a graphical user interface using Java Swing
* Add a database using SQLite
* Add user login functionality
* Add book categories
* Add due dates for borrowed books
* Add a book reservation system

## Author

Kağan Özsoy

