
package onlinequizapplication;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
public class Quiz {
     private ArrayList<Question> questions;

    private int score;

    private int correctAnswers;

    private int incorrectAnswers;
    private String userName;

    public Quiz() {

        questions = new ArrayList<>();

        score = 0;

        correctAnswers = 0;

        incorrectAnswers = 0;
        userName = "";
    }

    public void addQuestion(
            Question question
    ) {

        questions.add(
                question
        );
    }

   public void startQuiz(
        Scanner scanner) {

        if (questions.isEmpty()) {

            System.out.println(
                    "There are no questions in the quiz."
            );

            return;
        }

        

        score = 0;

        correctAnswers = 0;

        incorrectAnswers = 0;

        System.out.println(
                "\n=============================="
        );

        System.out.println(
                "WELCOME TO THE ONLINE QUIZ"
        );
        System.out.println(
        "Student: "
        + userName
);

        System.out.println(
                "=============================="
        );

        for (Question question : questions) {

            question.displayQuestion();

            char userAnswer;

            while (true) {

                System.out.print(
                        "\nEnter your answer "
                        + "(A, B, C, or D): "
                );

                String input =
                        scanner.nextLine()
                               .trim()
                               .toUpperCase();

                if (
                    input.length() == 1
                    &&
                    (
                        input.charAt(0) == 'A'
                        ||
                        input.charAt(0) == 'B'
                        ||
                        input.charAt(0) == 'C'
                        ||
                        input.charAt(0) == 'D'
                    )
                ) {

                    userAnswer =
                            input.charAt(0);

                    break;

                } else {

                    System.out.println(
                            "Invalid answer. "
                            + "Please enter A, B, C, or D."
                    );
                }
            }

            if (
                question.checkAnswer(
                        userAnswer
                )
            ) {

                System.out.println(
                        "Correct answer!"
                );

                correctAnswers++;

                score += 10;

            } else {

                System.out.println(
                        "Incorrect answer."
                );

                System.out.println(
                        "Correct answer: "
                        + question.getCorrectAnswer()
                );

                incorrectAnswers++;
            }
        }

        displayResult();
    }

    public void displayResult() {

        int totalQuestions =
        questions.size();

QuizResult result =
        new QuizResult(
                userName,
                totalQuestions,
                correctAnswers,
                incorrectAnswers,
                score
        );

double percentage =
        result.getSuccessRate();

        System.out.println(
                "\n=============================="
        );

        System.out.println(
                "QUIZ RESULT"
        );
        System.out.println(
        "Student: "
        + result.getUserName()
);

        System.out.println(
                "=============================="
        );

        System.out.println(
        "Total Questions: "
        + result.getTotalQuestions()
);

        System.out.println(
        "Correct Answers: "
        + result.getCorrectAnswers()
);

        System.out.println(
        "Incorrect Answers: "
        + result.getIncorrectAnswers()
);

        System.out.println(
        "Score: "
        + result.getScore()
);

        System.out.printf(
                "Success Rate: %.2f%%\n",
                percentage
        );

        if (percentage >= 80) {

            System.out.println(
                    "Excellent performance!"
            );

        } else if (percentage >= 50) {

            System.out.println(
                    "Good job!"
            );

        } else {

            System.out.println(
                    "Keep practicing!"
            );
        }
        saveResultToFile(
        result
);
    }
    private void saveResultToFile(
        QuizResult result
) {

    try {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(
                                "results.txt",
                                true
                        )
                );

        writer.write(
                "Quiz Result"
        );

        writer.newLine();
       writer.write(
        "Student: "
        + result.getUserName()
);

writer.newLine();

       writer.write(
        "Total Questions: "
        + result.getTotalQuestions()
);

        writer.newLine();

        writer.write(
        "Correct Answers: "
        + result.getCorrectAnswers()
);

        writer.newLine();

        writer.write(
        "Incorrect Answers: "
        + result.getIncorrectAnswers()
);

        writer.newLine();

       writer.write(
        "Score: "
        + result.getScore()
);

        writer.newLine();

        String.format(
        "Success Rate: %.2f%%",
        result.getSuccessRate()

        );

        writer.newLine();

        writer.write(
                "------------------------------"
        );

        writer.newLine();

        writer.close();

        System.out.println(
                "\nQuiz result saved successfully."
        );

    } catch (IOException e) {

        System.out.println(
                "\nThe quiz result could not be saved."
        );
    }
}
    public void setUserName(
        String userName
) {

    this.userName =
            userName.trim();
}
    public int getQuestionCount() {

    return questions.size();
}
    public void addNewQuestion(
        Scanner scanner
) {

    int questionId =
        getNextQuestionId();

    System.out.print(
            "\nEnter question text: "
    );

    String questionText =
            scanner.nextLine()
                   .trim();

    while (
            questionText.isEmpty()
    ) {

        System.out.println(
                "Question text cannot be empty."
        );

        System.out.print(
                "Enter question text: "
        );

        questionText =
                scanner.nextLine()
                       .trim();
    }

    System.out.print(
            "Enter option A: "
    );

    String optionA =
            scanner.nextLine()
                   .trim();

    System.out.print(
            "Enter option B: "
    );

    String optionB =
            scanner.nextLine()
                   .trim();

    System.out.print(
            "Enter option C: "
    );

    String optionC =
            scanner.nextLine()
                   .trim();

    System.out.print(
            "Enter option D: "
    );

    String optionD =
            scanner.nextLine()
                   .trim();

    char correctAnswer;

    while (true) {

        System.out.print(
                "Enter the correct answer "
                + "(A, B, C, or D): "
        );

        String input =
                scanner.nextLine()
                       .trim()
                       .toUpperCase();

        if (
                input.length() == 1
                &&
                (
                    input.charAt(0) == 'A'
                    ||
                    input.charAt(0) == 'B'
                    ||
                    input.charAt(0) == 'C'
                    ||
                    input.charAt(0) == 'D'
                )
        ) {

            correctAnswer =
                    input.charAt(0);

            break;

        } else {

            System.out.println(
                    "Invalid answer. "
                    + "Please enter A, B, C, or D."
            );
        }
    }

    Question newQuestion =
            new Question(
                    questionId,
                    questionText,
                    optionA,
                    optionB,
                    optionC,
                    optionD,
                    correctAnswer
            );

    questions.add(
        newQuestion
);

saveQuestionToFile(
        newQuestion
);

System.out.println(
        "\nNew question added successfully."
);
}
    private void saveQuestionToFile(
        Question question
) {

    try {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(
                                "questions.txt",
                                true
                        )
                );

        writer.write(
                question.getQuestionId()
                + ";"
                + question.getQuestionText()
                + ";"
                + question.getOptionA()
                + ";"
                + question.getOptionB()
                + ";"
                + question.getOptionC()
                + ";"
                + question.getOptionD()
                + ";"
                + question.getCorrectAnswer()
        );

        writer.newLine();

        writer.close();

        System.out.println(
                "Question saved to file successfully."
        );

    } catch (IOException e) {

        System.out.println(
                "The question could not be saved."
        );
    }
}
    public void loadQuestionsFromFile() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader(
                                "questions.txt"
                        )
                );

        String line;

        while (
                (line = reader.readLine())
                != null
        ) {

            String[] parts =
                    line.split(
                            ";"
                    );

            if (
                    parts.length == 7
            ) {

                int questionId =
                        Integer.parseInt(
                                parts[0]
                        );

                String questionText =
                        parts[1];

                String optionA =
                        parts[2];

                String optionB =
                        parts[3];

                String optionC =
                        parts[4];

                String optionD =
                        parts[5];

                char correctAnswer =
                        parts[6]
                                .charAt(0);

                Question question =
                        new Question(
                                questionId,
                                questionText,
                                optionA,
                                optionB,
                                optionC,
                                optionD,
                                correctAnswer
                        );

                questions.add(
                        question
                );
            }
        }

        reader.close();

    } catch (IOException e) {

        System.out.println(
                "No saved questions were found."
        );
    }
}
    private int getNextQuestionId() {

    int highestId = 0;

    for (
            Question question
            : questions
    ) {

        if (
                question.getQuestionId()
                > highestId
        ) {

            highestId =
                    question.getQuestionId();
        }
    }

    return highestId + 1;
}
    public void deleteQuestion(
        Scanner scanner
) {

    if (
            questions.isEmpty()
    ) {

        System.out.println(
                "\nThere are no questions to delete."
        );

        return;
    }

    System.out.print(
            "\nEnter the question ID to delete: "
    );

    if (
            !scanner.hasNextInt()
    ) {

        System.out.println(
                "Invalid question ID."
        );

        scanner.nextLine();

        return;
    }

    int questionId =
            scanner.nextInt();

    scanner.nextLine();

    Question questionToDelete =
            null;

    for (
            Question question
            : questions
    ) {

        if (
                question.getQuestionId()
                == questionId
        ) {

            questionToDelete =
                    question;

            break;
        }
    }

    if (
            questionToDelete
            == null
    ) {

        System.out.println(
                "Question ID "
                + questionId
                + " was not found."
        );

        return;
    }

    System.out.println(
            "\nQuestion:"
    );

    System.out.println(
            questionToDelete
                    .getQuestionText()
    );

    System.out.print(
            "Are you sure you want to delete "
            + "this question? (Y/N): "
    );

    String confirmation =
            scanner.nextLine()
                   .trim()
                   .toUpperCase();

    if (
            confirmation.equals(
                    "Y"
            )
    ) {

        questions.remove(
                questionToDelete
        );

        updateQuestionsFile();

        System.out.println(
                "Question deleted successfully."
        );

    } else {

        System.out.println(
                "Question deletion cancelled."
        );
    }
}
    private void updateQuestionsFile() {

    try {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(
                                "questions.txt",
                                false
                        )
                );

        for (
                Question question
                : questions
        ) {

            if (
                    question.getQuestionId()
                    > 5
            ) {

                writer.write(
                        question.getQuestionId()
                        + ";"
                        + question.getQuestionText()
                        + ";"
                        + question.getOptionA()
                        + ";"
                        + question.getOptionB()
                        + ";"
                        + question.getOptionC()
                        + ";"
                        + question.getOptionD()
                        + ";"
                        + question.getCorrectAnswer()
                );

                writer.newLine();
            }
        }

        writer.close();

    } catch (IOException e) {

        System.out.println(
                "The questions file could not be updated."
        );
    }
}
}
