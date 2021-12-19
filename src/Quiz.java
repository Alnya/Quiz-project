public class Quiz {
    private final String name;
    private final String problem;
    private final String explanation;
    private final String correctAnswer;

    /**
     * Quizのコンストラクタです。
     *
     * @param name          問題番号
     * @param problem       問題文
     * @param explanation   解説文
     * @param correctAnswer 正答
     */
    public Quiz(String name, String problem, String explanation, String correctAnswer) {
        this.name = name;
        this.problem = problem;
        this.explanation = explanation;
        this.correctAnswer = correctAnswer;
    }

    /**
     * 問題番号を返すためのメソッド。
     *
     * @return String 問題番号
     */
    public String getName() {
        return this.name;
    }

    /**
     * 問題文を返すためのメソッド。
     *
     * @return String 問題文
     */
    public String getProblem() {
        return this.problem;
    }

    /**
     * 解説文を返すためのメソッド。
     *
     * @return String 解説文
     */
    public String getExplanation() {
        return this.explanation;
    }

    /**
     * 正答を返すためのメソッド。
     *
     * @return String 正答
     */
    public String getCorrectAnswer() {
        return this.correctAnswer;
    }
}
