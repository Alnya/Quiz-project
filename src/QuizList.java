import java.util.ArrayList;
import java.util.List;

public class QuizList {
    private final List<Quiz> quizList = new ArrayList<Quiz>();

    public QuizList() {

    }

    public Quiz getQuiz(int index) {
        return this.quizList.get(index);
    }
}
