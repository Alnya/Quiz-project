public class Main {
    private static Result result;

    public static void main(String[] args) {
        /*
          Test program of main.
          read problem, correct-answer and explanation.
          run quiz.
         */
        Cls.setTitle();
        Cls.clear();
        QuizAllList quizAllList = new QuizAllList();
        result = quizAllList.run();
        result.printResult();
    }
}
