import java.util.ArrayList;
import java.util.List;

public class QuizAllList {
    private final List<QuizList> quizAllList = new ArrayList<QuizList>();

    public QuizAllList() {

    }

    public void addQuizList(QuizList quizList) {
        this.quizAllList.add(quizList);
    }

    public QuizList getQuizList(int index) {
        return this.quizAllList.get(index);
    }
}
