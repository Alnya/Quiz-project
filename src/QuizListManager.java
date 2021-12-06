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
            this.supportRun(quiz);
        }
        return this.result;
    }

    private void supportRun(Quiz quiz) {
        this.result.addSelectedQuiz(quiz);
        println(quiz.getProblem());
        String userAnswer = acceptUserAnswer();
        this.result.addAnswer(userAnswer);
        SentenceUtils.printBar();
        judgeAnswer(userAnswer, quiz.getCorrectAnswer());
        SentenceUtils.printBar();
        SentenceUtils.printToExplanation();
        scanln();
        SentenceUtils.printBar();
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
        SentenceUtils.printToSpecial();
        this.supportRun(quiz);
        return this.result;
    }

    private static String acceptUserAnswer() {
        SentenceUtils.printAcceptUserAnswer();
        return scanln();
    }

    private static void judgeAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            SentenceUtils.printCorrect();
        } else {
            SentenceUtils.printIncorrect();
        }
    }

    private static void goNextProblem() {
        SentenceUtils.printToNext();
        scanln();
        Cls.clear();
    }

    private static String scanln() {
        return scanner.nextLine();
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
