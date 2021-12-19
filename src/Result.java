import java.util.ArrayList;
import java.util.List;

public class Result {
    private final List<Quiz> selectedQuizList = new ArrayList<Quiz>();
    private final List<String> answers = new ArrayList<String>();

    /**
     * コンストラクタです。
     */
    public Result() {

    }

    /**
     * 今まで答えてきたQuizをまとめたListを返すメソッド。
     *
     * @return List<Quiz>
     */
    public List<Quiz> getSelectedQuizList() {
        return this.selectedQuizList;
    }

    /**
     * 今まで答えてきた自分の答えをまとめたListを返すメソッド。
     * 未使用です。
     *
     * @return List<String>
     */
    public List<String> getAnswers() {
        return this.answers;
    }

    /**
     * 自分が答えた問題を新たに追加するときに使うメソッド。
     *
     * @param quiz 追加するQuiz
     */
    public void addSelectedQuiz(Quiz quiz) {
        this.selectedQuizList.add(quiz);
    }

    /**
     * 自分が答えた解答を新たに追加するときに使うメソッド。
     *
     * @param answer 追加する解答
     */
    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    /**
     * 最終結果を出力するためのメソッド。
     */
    public void printResult() {
        SentenceUtils.printFinalResult();
        try {
            for (int i = 0; i < this.selectedQuizList.size(); i++) {
                Quiz quiz = this.selectedQuizList.get(i);
                String answer = this.answers.get(i);
                SentenceUtils.printResultProblem(quiz.getName(), answer, quiz.getCorrectAnswer());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error! Can't call this method now...");
        }
        SentenceUtils.printFinalScore(this.getScore(), this.selectedQuizList.size());
    }

    /**
     * 現在のスコアを算出するためのメソッド。
     *
     * @return int 現在のスコア
     */
    public int getScore() {
        try {
            int score = 0;
            for (int i = 0; i < this.selectedQuizList.size(); i++) {
                Quiz quiz = selectedQuizList.get(i);
                String answer = answers.get(i);
                if (quiz.getCorrectAnswer().equals(answer)) {
                    score++;
                }
            }
            return score;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error! Can't call this method now...");
            return 0;
        }
    }
}
