import java.util.ArrayList;
import java.util.List;

public class Result {
    private final List<Quiz> selectedQuizList = new ArrayList<Quiz>();
    private final List<String> answers = new ArrayList<String>();

    /**
     * �R���X�g���N�^�ł��B
     */
    public Result() {

    }

    /**
     * ���܂œ����Ă���Quiz���܂Ƃ߂�List��Ԃ����\�b�h�B
     *
     * @return List<Quiz>
     */
    public List<Quiz> getSelectedQuizList() {
        return this.selectedQuizList;
    }

    /**
     * ���܂œ����Ă��������̓������܂Ƃ߂�List��Ԃ����\�b�h�B
     * ���g�p�ł��B
     *
     * @return List<String>
     */
    public List<String> getAnswers() {
        return this.answers;
    }

    /**
     * ����������������V���ɒǉ�����Ƃ��Ɏg�����\�b�h�B
     *
     * @param quiz �ǉ�����Quiz
     */
    public void addSelectedQuiz(Quiz quiz) {
        this.selectedQuizList.add(quiz);
    }

    /**
     * �������������𓚂�V���ɒǉ�����Ƃ��Ɏg�����\�b�h�B
     *
     * @param answer �ǉ������
     */
    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    /**
     * �ŏI���ʂ��o�͂��邽�߂̃��\�b�h�B
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
     * ���݂̃X�R�A���Z�o���邽�߂̃��\�b�h�B
     *
     * @return int ���݂̃X�R�A
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
