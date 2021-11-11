public class Quiz {
    private final String name;
    private final String problem;
    private final String explanation;

    public Quiz(String name, String problem, String explanation) {
        this.name = name;
        this.problem = problem;
        this.explanation = explanation;
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

    public void printName() {
        print(this.name);
    }

    public void printProblem() {
        print(this.problem);
    }

    public void printExplanation() {
        print(this.explanation);
    }

    private void print(Object obj) {
        System.out.print(obj);
    }

    private void println(Object obj) {
        System.out.println(obj);
    }
}
