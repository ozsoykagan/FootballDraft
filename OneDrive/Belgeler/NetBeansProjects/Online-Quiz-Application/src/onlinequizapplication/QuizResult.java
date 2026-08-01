package onlinequizapplication;

public class QuizResult {

    private String userName;

    private int totalQuestions;

    private int correctAnswers;

    private int incorrectAnswers;

    private int score;

    private double successRate;

    public QuizResult(
            String userName,
            int totalQuestions,
            int correctAnswers,
            int incorrectAnswers,
            int score
    ) {

        this.userName =
                userName;

        this.totalQuestions =
                totalQuestions;

        this.correctAnswers =
                correctAnswers;

        this.incorrectAnswers =
                incorrectAnswers;

        this.score =
                score;

        if (
                totalQuestions > 0
        ) {

            successRate =
                    (
                        (double) correctAnswers
                        / totalQuestions
                    )
                    * 100;

        } else {

            successRate = 0;
        }
    }

    public String getUserName() {

        return userName;
    }

    public int getTotalQuestions() {

        return totalQuestions;
    }

    public int getCorrectAnswers() {

        return correctAnswers;
    }

    public int getIncorrectAnswers() {

        return incorrectAnswers;
    }

    public int getScore() {

        return score;
    }

    public double getSuccessRate() {

        return successRate;
    }
}