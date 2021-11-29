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
            println("����� [Enter]");
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
//            println("����� [Enter]");
//            scanln();
//            printBar();
//            println(quiz.getExplanation());
//            goNextProblem();
//        }
        return this.result;
    }

    private static String acceptUserAnswer() {
        print("\n��������͂��Ă�������>>");
        return scanln();
    }

    private static void judgeAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            println("\t�����I�Z");
        } else {
            println("\t�s����...�~");
        }
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
