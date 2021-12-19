import java.util.ArrayList;
import java.util.Collections;

public class QuizListManager {
    private final QuizList quizList;
    private final Result result;

    /**
     * �R���X�g���N�^�ł��B
     * QuizListManager�͌���QuizList��ɑ΂�����݂��A
     * QuizList����Quiz�����s�E�Ǘ����邱�Ƃ�ړI�Ƃ��Ă���B
     *
     * @param quizList ���̃}�l�[�W���[���S������QuizList
     * @param result   ���̃v���W�F�N�g�ň������т��Ǘ����邽�߂�Result
     */
    public QuizListManager(QuizList quizList, Result result) {
        this.quizList = quizList;
        this.result = result;
    }

    /**
     * QuizList����Quiz�����s���邽�߂̃��\�b�h�B
     *
     * @return Result ����
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
     * runQuiz���\�b�h�̕⏕���\�b�h�B
     * ���\�b�h�����y�эė��p�����₷�����邽�߂ɐ��܂�Ă������݁B
     *
     * @param quiz ���s����Quiz
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
     * ���p�������s����Ƃ��Ɏg�����\�b�h�B
     * ���ʂȉ��o����������Ă��܂��B
     *
     * @return Result ����
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
     * ���[�U�[�̉𓚂��󂯕t���邽�߂̃��\�b�h�B
     *
     * @return String ��
     */
    private static String acceptUserAnswer() {
        SentenceUtils.printAcceptUserAnswer();
        return ScanUtils.scanln();
    }

    /**
     * ���[�U�[�̉𓚂Ɛ������Ƃ炵���킹�A
     * ���딻������郁�\�b�h�B
     *
     * @param userAnswer    ���[�U�[�̉�
     * @param correctAnswer ����
     */
    private static void judgeAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            SentenceUtils.printCorrect();
        } else {
            SentenceUtils.printIncorrect();
        }
    }

    /**
     * ���̖��ɐi�ނƂ��Ɏg�����\�b�h�B
     * ���[�U�[�̃G���^�[�L�[���͂��󂯕t���܂��B
     */
    private static void goNextProblem() {
        SentenceUtils.printToNext();
        ScanUtils.scanln();
        Cls.clear();
    }

    /**
     * �o�͂����郁�\�b�h���������̂ŁA�ȗ����邽�߂ɐ��܂�Ă������\�b�h�B
     *
     * @param obj Object
     */
    private static void println(Object obj) {
        System.out.println(obj);
    }
}
