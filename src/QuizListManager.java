import java.util.Scanner;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result = new Result();
    private static final Scanner scanner = new Scanner(System.in);

    public QuizListManager(QuizList quizList) {
        this.quizList = quizList;
    }

    public Result runQuiz() {
        for (int i = 0; i < this.quizList.size(); i++) {
            Quiz quiz = this.quizList.getQuiz(i);
            this.result.addSelectedQuiz(quiz);
            Cls.clear();
            println(quiz.getProblem());
            String userAnswer = acceptUserAnswer();
            result.addAnswer(userAnswer);
            printBar();
            judgeAnswer(userAnswer, quiz.getCorrectAnswer());
            printBar();
            println("解説へ [Enter]");
            scanln();
            printBar();
            println(quiz.getExplanation());
            goNextProblem();
        }
        return this.result;
    }

    private static String acceptUserAnswer() {
        print("\n答えを入力してください>>");
        return scanln();
    }

    private static void judgeAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            println("\t正解！〇");
        } else {
            println("\t不正解...×");
        }
    }

    private static void goNextProblem() {
        print("\n次の問題へ [Enter]");
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
