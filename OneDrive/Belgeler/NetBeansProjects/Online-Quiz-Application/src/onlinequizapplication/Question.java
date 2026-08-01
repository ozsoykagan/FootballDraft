
package onlinequizapplication;


public class Question {
    private int questionId;

    private String questionText;

    private String optionA;

    private String optionB;

    private String optionC;

    private String optionD;

    private char correctAnswer;
    public Question(
            int questionId,
            String questionText,
            String optionA,
            String optionB,
            String optionC,
            String optionD,
            char correctAnswer
    ) {

        this.questionId = questionId;

        this.questionText = questionText;

        this.optionA = optionA;

        this.optionB = optionB;

        this.optionC = optionC;

        this.optionD = optionD;

        this.correctAnswer =
                Character.toUpperCase(
                        correctAnswer
                );
    }
    public int getQuestionId() {

        return questionId;
    }

    public String getQuestionText() {

        return questionText;
    }

    public String getOptionA() {

        return optionA;
    }

    public String getOptionB() {

        return optionB;
    }

    public String getOptionC() {

        return optionC;
    }

    public String getOptionD() {

        return optionD;
    }

    public char getCorrectAnswer() {

        return correctAnswer;
    }
    public boolean checkAnswer(
            char userAnswer
    ) {

        return Character.toUpperCase(
                userAnswer
        ) == correctAnswer;
    }
public void displayQuestion() {

        System.out.println(
                "\nQuestion "
                + questionId
                + ": "
                + questionText
        );

        System.out.println(
                "A) "
                + optionA
        );

        System.out.println(
                "B) "
                + optionB
        );

        System.out.println(
                "C) "
                + optionC
        );

        System.out.println(
                "D) "
                + optionD
        );
    }
}
