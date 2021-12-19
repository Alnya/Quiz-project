import java.util.ArrayList;
import java.util.Collections;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result;

    /**
     * コンストラクタです。
     * QuizListManagerは原則QuizList一つに対し一つ存在し、
     * QuizList内のQuizを実行・管理することを目的としている。
     *
     * @param quizList このマネージャーが担当するQuizList
     * @param result   このプロジェクトで扱う成績を管理するためのResult
     */
    public QuizListManager(QuizList quizList, Result result) {
        this.quizList = quizList;
        this.result = result;
    }

    /**
     * QuizList内のQuizを実行するためのメソッド。
     *
     * @return Result 成績
     */
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

    /**
     * runQuizメソッドの補助メソッド。
     * メソッド分割及び再利用をしやすくするために生まれてきた存在。
     *
     * @param quiz 実行するQuiz
     */
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

    /**
     * 応用問題を実行するときに使うメソッド。
     * 特別な演出が実装されています。
     *
     * @return Result 成績
     */
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

    /**
     * ユーザーの解答を受け付けるためのメソッド。
     *
     * @return String 解答
     */
    private static String acceptUserAnswer() {
        SentenceUtils.printAcceptUserAnswer();
        return ScanUtils.scanln();
    }

    /**
     * ユーザーの解答と正答を照らし合わせ、
     * 正誤判定をするメソッド。
     *
     * @param userAnswer    ユーザーの解答
     * @param correctAnswer 正答
     */
    private static void judgeAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            SentenceUtils.printCorrect();
        } else {
            SentenceUtils.printIncorrect();
        }
    }

    /**
     * 次の問題に進むときに使うメソッド。
     * ユーザーのエンターキー入力を受け付けます。
     */
    private static void goNextProblem() {
        SentenceUtils.printToNext();
        ScanUtils.scanln();
        Cls.clear();
    }

    /**
     * 出力をするメソッド文が長いので、省略するために生まれてきたメソッド。
     *
     * @param obj Object
     */
    private static void println(Object obj) {
        System.out.println(obj);
    }
}
