import java.util.ArrayList;
import java.util.List;

public class QuizList {
    private final List<Quiz> quizList = new ArrayList<Quiz>();

    /**
     * コンストラクタです。
     */
    public QuizList() {

    }

    /**
     * Quizを追加するためのメソッド。
     *
     * @param quiz 追加したいQuiz
     */
    public void addQuiz(Quiz quiz) {
        this.quizList.add(quiz);
    }

    /**
     * 指定したインデックスのQuizを返すためのメソッド。
     *
     * @param index Quizのインデックス
     * @return Quiz
     */
    public Quiz getQuiz(int index) {
        return this.quizList.get(index);
    }

    /**
     * このQuizListの長さを返すためのメソッド。
     *
     * @return int QuizListの長さ
     */
    public int size() {
        return this.quizList.size();
    }
}
