import java.util.ArrayList;
import java.util.List;

public class Result {
    private final List<Quiz> selectedQuizList = new ArrayList<Quiz>();
    private final List<String> answers = new ArrayList<String>();

    public Result() {

    }

    public void addSelectedQuiz(Quiz quiz) {
        this.selectedQuizList.add(quiz);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void printResult() {

    }

    public int score() {
        return 0;
    }
}
