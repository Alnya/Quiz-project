import java.util.ArrayList;
import java.util.List;

public class QuizList {
    private final List<Quiz> quizList = new ArrayList<Quiz>();

    /**
     * �R���X�g���N�^�ł��B
     */
    public QuizList() {

    }

    /**
     * Quiz��ǉ����邽�߂̃��\�b�h�B
     *
     * @param quiz �ǉ�������Quiz
     */
    public void addQuiz(Quiz quiz) {
        this.quizList.add(quiz);
    }

    /**
     * �w�肵���C���f�b�N�X��Quiz��Ԃ����߂̃��\�b�h�B
     *
     * @param index Quiz�̃C���f�b�N�X
     * @return Quiz
     */
    public Quiz getQuiz(int index) {
        return this.quizList.get(index);
    }

    /**
     * ����QuizList�̒�����Ԃ����߂̃��\�b�h�B
     *
     * @return int QuizList�̒���
     */
    public int size() {
        return this.quizList.size();
    }
}
