import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result;
    private static final Scanner scanner = new Scanner(System.in);

    public QuizListManager(QuizList quizList, Result result) {
        this.quizList = quizList;
        this.result = result;
    }

    public Result runQuiz() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < this.quizList.size(); i++) {
            integerArrayList.add(i);
        }
        Collections.shuffle(integerArrayList);
        for (int i = 0; i < 5; i++) {
            Quiz quiz = this.quizList.getQuiz(integerArrayList.get(i));
            supportRun(quiz);
            goNextProblem();
        }
        return this.result;
    }

    private void supportRun(Quiz quiz) {
        this.result.addSelectedQuiz(quiz);
        println(quiz.getProblem());
        String userAnswer = acceptUserAnswer();
        this.result.addAnswer(userAnswer);
        printBar();
        judgeAnswer(userAnswer, quiz.getCorrectAnswer());
        printBar();
        println("解説へ [Enter]");
        scanln();
        printBar();
        println(quiz.getExplanation());
        goNextProblem();
    }

    public Result runSpecialQuiz() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < this.quizList.size(); i++) {
            integerArrayList.add(i);
        }
        Collections.shuffle(integerArrayList);
        Quiz quiz = this.quizList.getQuiz(integerArrayList.get(0));
        System.out.println("正答率が8割超えたので、応用問題が出現した！\n");
        supportRun(quiz);
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
        print("\n次へ進む [Enter]");
        scanln();
        Cls.clear();
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
