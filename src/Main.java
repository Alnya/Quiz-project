import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
          The main program.
          read problem, correct-answer and explanation.
          run quiz.
         */
        Cls.setTitle();
        Cls.clear();
        SentenceUtils.printTitle();
        scanner.nextLine();
        Cls.clear();
        QuizAllList quizAllList = new QuizAllList();
        Result result = quizAllList.run();
        result.printResult();
    }
}
