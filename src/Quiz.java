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

    public void printName() {
        print(this.name);
    }

    public void printProblem() {
        print(this.problem);
    }

    public void printExplanation() {
        print(this.explanation);
    }

    public void printCorrectAnswer() {
        print(this.correctAnswer);
    }

    private void print(Object obj) {
        System.out.print(obj);
    }

    private void println(Object obj) {
        System.out.println(obj);
    }
}
