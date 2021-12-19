import java.util.ArrayList;
import java.util.List;

public class QuizAllList {
    private final List<QuizList> quizAllList = new ArrayList<QuizList>();

    /**
     * コンストラクタです。
     * 第一章：問題番号001-010
     * 第二章：問題番号101-110
     * 応用問題：問題番号201-203
     *
     * それぞれQuizListで管理し、それらを束ねています。
     */
    public QuizAllList() {
        QuizList quizList = new QuizList();
        for (int i = 1; i <= 10; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList.addQuiz(quiz);
        }
        this.quizAllList.add(quizList);
        QuizList quizList100 = new QuizList();
        for (int i = 101; i <= 110; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList100.addQuiz(quiz);
        }
        this.quizAllList.add(quizList100);
        QuizList quizList200 = new QuizList();
        for (int i = 201; i <= 203; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList200.addQuiz(quiz);
        }
        this.quizAllList.add(quizList200);
    }

    /**
     * QuizAllListで管理しているQuizListの問題を実行するためのメソッド。
     *
     * @return Result 成績を管理し、適切に返します。
     */
    public Result run() {
        Result result = new Result();
        for (int i = 0; i < 2; i++) {
            QuizList list = this.quizAllList.get(i);
            QuizListManager manager = new QuizListManager(list, result);
            result = manager.runQuiz();
        }
        if (result.getScore() >= 8) {
            QuizList list = this.quizAllList.get(2);
            QuizListManager manager = new QuizListManager(list, result);
            result = manager.runSpecialQuiz();
        }
        return result;
    }

    /**
     * QuizListを途中で追加するためのメソッド。
     * 未使用です。
     *
     * @param quizList 追加したいQuizList
     */
    public void addQuizList(QuizList quizList) {
        this.quizAllList.add(quizList);
    }

    /**
     * 指定したインデックスのQuizListを取り出すメソッド。
     * 未使用です。
     *
     * @param index 取り出したいQuizListのインデックス
     * @return QuizList
     */
    public QuizList getQuizList(int index) {
        return this.quizAllList.get(index);
    }
}
