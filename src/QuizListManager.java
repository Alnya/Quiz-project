import java.util.ArrayList;
import java.util.Collections;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result;

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
        SentenceUtils.printProgress(this.result.getSelectedQuizList().size());
        this.result.addSelectedQuiz(quiz);
        println(quiz.getProblem());
        String userAnswer = acceptUserAnswer();
        this.result.addAnswer(userAnswer);
        SentenceUtils.printBar();
        judgeAnswer(userAnswer, quiz.getCorrectAnswer());
        SentenceUtils.printBar();
        SentenceUtils.printToExplanation();
        ScanUtils.scanln();
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
        return ScanUtils.scanln();
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
        ScanUtils.scanln();
        Cls.clear();
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
