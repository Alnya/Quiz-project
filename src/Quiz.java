public class Quiz {
    private final String name;
    private final String problem;
    private final String explanation;
    private final String correctAnswer;

    /**
     * Quiz�̃R���X�g���N�^�ł��B
     *
     * @param name          ���ԍ�
     * @param problem       ��蕶
     * @param explanation   �����
     * @param correctAnswer ����
     */
    public Quiz(String name, String problem, String explanation, String correctAnswer) {
        this.name = name;
        this.problem = problem;
        this.explanation = explanation;
        this.correctAnswer = correctAnswer;
    }

    /**
     * ���ԍ���Ԃ����߂̃��\�b�h�B
     *
     * @return String ���ԍ�
     */
    public String getName() {
        return this.name;
    }

    /**
     * ��蕶��Ԃ����߂̃��\�b�h�B
     *
     * @return String ��蕶
     */
    public String getProblem() {
        return this.problem;
    }

    /**
     * �������Ԃ����߂̃��\�b�h�B
     *
     * @return String �����
     */
    public String getExplanation() {
        return this.explanation;
    }

    /**
     * ������Ԃ����߂̃��\�b�h�B
     *
     * @return String ����
     */
    public String getCorrectAnswer() {
        return this.correctAnswer;
    }
}
