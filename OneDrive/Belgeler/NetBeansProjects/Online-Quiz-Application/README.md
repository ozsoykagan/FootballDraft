# Online Quiz Application

A console-based Online Quiz Application developed using Java. The application allows users to answer multiple-choice questions, calculate their scores, manage quiz questions, and save quiz results using text files.

## Features

* Start a multiple-choice quiz
* Enter a user name before starting the quiz
* Answer questions using options A, B, C, or D
* Validate user input
* Calculate the quiz score automatically
* Display the number of correct and incorrect answers
* Calculate the success rate
* Display performance feedback
* Save quiz results to a text file
* View previous quiz results
* Add new quiz questions
* Save new questions to a text file
* Load saved questions when the application starts
* Delete quiz questions
* Use dynamic question IDs
* Display the current number of quiz questions

## Technologies Used

* Java
* Object-Oriented Programming
* Java Collections
* ArrayList
* File Handling
* Exception Handling
* Scanner
* BufferedReader
* BufferedWriter

## Project Structure

```text
OnlineQuizApplication
│
├── src
│   └── onlinequizapplication
│       ├── Main.java
│       ├── Question.java
│       ├── Quiz.java
│       └── QuizResult.java
│
├── questions.txt
├── results.txt
├── build.xml
├── README.md
└── nbproject
```

## Class Descriptions

### Main.java

The main class of the application. It displays the menu, receives user input, and controls the application flow.

### Question.java

Represents a quiz question. It stores the question text, answer options, correct answer, and question ID.

### Quiz.java

Manages quiz operations such as starting the quiz, checking answers, calculating scores, adding questions, deleting questions, and performing file operations.

### QuizResult.java

Stores the result information of a completed quiz, including the user name, score, correct answers, incorrect answers, and success rate.

## Menu Options

```text
1 - Start Quiz
2 - View Quiz Information
3 - View Result History
4 - Add New Question
5 - Delete Question
0 - Exit
```

## How to Run

1. Open the project using NetBeans.
2. Open the `Main.java` file.
3. Build the project.
4. Run the application.
5. Select an option from the main menu.

## Example Quiz Result

```text
==============================
QUIZ RESULT
Student: Kagan
==============================

Total Questions: 5
Correct Answers: 4
Incorrect Answers: 1
Score: 40
Success Rate: 80.00%

Excellent performance!
```

## Learning Objectives

This project was developed to practice:

* Classes and objects
* Encapsulation
* Constructors
* Getter methods
* ArrayList
* Loops
* Conditional statements
* Switch-case statements
* User input validation
* File reading and writing
* Exception handling
* Object-Oriented Programming principles

## Author

Kağan Özsoy

Computer Engineering Student

