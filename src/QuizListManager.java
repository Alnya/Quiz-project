import java.util.Scanner;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result = new Result();
    private static final Scanner scanner = new Scanner(System.in);

    public QuizListManager(QuizList quizList) {
        this.quizList = quizList;
    }

    public Result runQuiz() {
        Cls.clear();
//        println(quiz.getProblem());
        String userAnswer = acceptUserAnswer();
        result.addAnswer(userAnswer);
        printBar();
//        if (userAnswer.equals(quiz.getCorrectAnswer())) {
//            println("\t�����I�Z");
//        } else {
//            println("\t�s����...�~");
//        }
        printBar();
        println("����� [Enter]");
        scanln();
        printBar();
//        println(quiz.getExplanation());
        goNextProblem();
        return this.result;
    }

    private static String acceptUserAnswer() {
        print("\n��������͂��Ă�������>>");
        return scanln();
    }

    private static void goNextProblem() {
        print("\n���̖��� [Enter]");
        scanln();
    }

    private static String scanln() {
        return scanner.nextLine();
    }

    private static void printBar() {
        println("---------------------------------");
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
