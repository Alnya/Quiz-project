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
            this.result.addSelectedQuiz(quiz);
            Cls.clear();
            println(quiz.getProblem());
            String userAnswer = acceptUserAnswer();
            result.addAnswer(userAnswer);
            printBar();
            judgeAnswer(userAnswer, quiz.getCorrectAnswer());
            printBar();
            println("âê‡Ç÷ [Enter]");
            scanln();
            printBar();
            println(quiz.getExplanation());
            goNextProblem();
        }
//        for (int i = 0; i < this.quizList.size(); i++) {
//            Quiz quiz = this.quizList.getQuiz(i);
//            this.result.addSelectedQuiz(quiz);
//            Cls.clear();
//            println(quiz.getProblem());
//            String userAnswer = acceptUserAnswer();
//            result.addAnswer(userAnswer);
//            printBar();
//            judgeAnswer(userAnswer, quiz.getCorrectAnswer());
//            printBar();
//            println("âê‡Ç÷ [Enter]");
//            scanln();
//            printBar();
//            println(quiz.getExplanation());
//            goNextProblem();
//        }
        return this.result;
    }

    private static String acceptUserAnswer() {
        print("\nìöÇ¶Çì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢>>");
        return scanln();
    }

    private static void judgeAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            println("\tê≥âÅIÅZ");
        } else {
            println("\tïsê≥â...Å~");
        }
    }

    private static void goNextProblem() {
        print("\néüÇÃñ‚ëËÇ÷ [Enter]");
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
