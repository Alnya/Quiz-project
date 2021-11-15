public class Quiz {
    private final String name;
    private final String problem;
    private final String explanation;
    private final String correctAnswer;

    public Quiz(String name, String problem, String explanation, String correctAnswer) {
        this.name = name;
        this.problem = problem;
        this.explanation = explanation;
        this.correctAnswer = correctAnswer;
    }

    public String getName() {
        return this.name;
    }

    public String getProblem() {
        return this.problem;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }
}
