public class Main {
    public static void main(String[] args) {
        /*
          The main program.
          read problem, correct-answer and explanation.
          run quiz.
         */
        Cls.setTitle();
        Cls.clear();
        QuizAllList quizAllList = new QuizAllList();
        Result result = quizAllList.run();
        result.printResult();
    }
}
