package onlinequizapplication;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz();

addQuestions(quiz);

quiz.loadQuestionsFromFile();

        int choice = 0;

        do {

            showMenu();

            if (scanner.hasNextInt()) {

                choice = scanner.nextInt();

                scanner.nextLine();

            } else {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.nextLine();

                continue;
            }

            switch (choice) {

                case 1:

    System.out.print(
            "\nEnter your name: "
    );

    String userName =
            scanner.nextLine()
                   .trim();

    while (userName.isEmpty()) {

        System.out.println(
                "Name cannot be empty."
        );

        System.out.print(
                "Enter your name: "
        );

        userName =
                scanner.nextLine()
                       .trim();
    }

    quiz.setUserName(
            userName
    );

    quiz.startQuiz(
            scanner
    );

    break;

                case 2:

                    showQuizInformation(quiz);

                    break;
                    case 3:

                     viewResultHistory();

                    break;
                    case 4:

    quiz.addNewQuestion(
            scanner
    );

    break;
    case 5:

    quiz.deleteQuestion(
            scanner
    );

    break;

                case 0:

                    System.out.println(
                            "\nThank you for using the Online Quiz Application."
                    );

                    System.out.println(
                            "The application is closing..."
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid menu option. Please try again."
                    );
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void showMenu() {

        System.out.println(
                "\n================================"
        );

        System.out.println(
                "     ONLINE QUIZ APPLICATION"
        );

        System.out.println(
                "================================"
        );

        System.out.println(
                "1 - Start Quiz"
        );

        System.out.println(
                "2 - View Quiz Information"
        );
        System.out.println(
        "3 - View Result History"
        );
        System.out.println(
        "4 - Add New Question"
);
        System.out.println(
        "5 - Delete Question"
);

        System.out.println(
                "0 - Exit"
        );

        System.out.print(
                "\nEnter your choice: "
        );
    }

    public static void showQuizInformation(Quiz quiz){

        System.out.println(
                "\n================================"
        );

        System.out.println(
                "       QUIZ INFORMATION"
        );

        System.out.println(
                "================================"
        );

        System.out.println(
        "Number of Questions: "
        + quiz.getQuestionCount()
);

        System.out.println(
                "Points for Each Correct Answer: 10"
        );

        System.out.println(
                "Maximum Score: 50"
        );

        System.out.println(
                "Available Answers: A, B, C, D"
        );
    }

    public static void addQuestions(
            Quiz quiz
    ) {

        Question question1 =
                new Question(
                        1,
                        "Which keyword is used to create an object in Java?",
                        "class",
                        "new",
                        "public",
                        "void",
                        'B'
                );

        Question question2 =
                new Question(
                        2,
                        "Which data type stores whole numbers in Java?",
                        "double",
                        "boolean",
                        "int",
                        "char",
                        'C'
                );

        Question question3 =
                new Question(
                        3,
                        "Which method is the entry point of a Java program?",
                        "start()",
                        "main()",
                        "run()",
                        "execute()",
                        'B'
                );

        Question question4 =
                new Question(
                        4,
                        "Which collection can store multiple objects?",
                        "String",
                        "ArrayList",
                        "int",
                        "char",
                        'B'
                );

        Question question5 =
                new Question(
                        5,
                        "Which symbol is used to end a Java statement?",
                        ":",
                        ",",
                        ";",
                        ".",
                        'C'
                );

        quiz.addQuestion(question1);

        quiz.addQuestion(question2);

        quiz.addQuestion(question3);

        quiz.addQuestion(question4);

        quiz.addQuestion(question5);
    }
    public static void viewResultHistory() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(
                                "results.txt"
                        )
                );

        String line;

        boolean hasResults = false;

        System.out.println(
                "\n================================"
        );

        System.out.println(
                "        RESULT HISTORY"
        );

        System.out.println(
                "================================"
        );

        while (
                (line = reader.readLine())
                != null
        ) {

            System.out.println(
                    line
            );

            hasResults = true;
        }

        if (!hasResults) {

            System.out.println(
                    "There are no saved quiz results."
            );
        }

        reader.close();

    } catch (IOException e) {

        System.out.println(
                "\nThere are no saved quiz results."
        );
    }
}
}