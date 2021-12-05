import java.util.ArrayList;
import java.util.List;

public class QuizAllList {
    private final List<QuizList> quizAllList = new ArrayList<QuizList>();

    public QuizAllList() {
        QuizList quizList = new QuizList();
        for (int i = 1; i <= 5; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList.addQuiz(quiz);
        }
        this.quizAllList.add(quizList);
        QuizList quizList100 = new QuizList();
        for (int i = 101; i <= 110; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList100.addQuiz(quiz);
        }
        this.quizAllList.add(quizList100);
        QuizList quizList200 = new QuizList();
        for (int i = 201; i <= 203; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            quizList200.addQuiz(quiz);
        }
        this.quizAllList.add(quizList200);
    }

    public Result run() {
        Result result = new Result();
        for (int i = 0; i < 2; i++) {
            QuizList list = this.quizAllList.get(i);
            QuizListManager manager = new QuizListManager(list, result);
            result = manager.runQuiz();
        }
        if (result.getScore() >= 8){
            
        }
        return result;
    }

    public void addQuizList(QuizList quizList) {
        this.quizAllList.add(quizList);
    }

    public QuizList getQuizList(int index) {
        return this.quizAllList.get(index);
    }
}
