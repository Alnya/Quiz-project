import java.util.Scanner;

public class Main {
    private static final Result result = new Result();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
          Test program of main.
          read problem, correct-answer and explanation.
          run quiz.
         */
        Cls.clear();
        QuizList quizList = new QuizList();
        for (int i = 1; i <= 3; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList.addQuiz(quiz);
        }

        QuizListManager manager = new QuizListManager(quizList);
        manager.runQuiz();
    }
}
