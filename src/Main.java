import java.util.Scanner;

public class Main {
    private static final Result result = new Result();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
          Test program of main.
          read problem, correct-answer and explanation.
          run quiz.
         */
        Cls.clear();
        for (int i = 1; i <= 2; i++) {
            String problem = ReadFiles.readProblem(i);
            String correctAnswer = ReadFiles.readCorrectAnswer(i);
            String explanation = ReadFiles.readExplanation(i);
            Quiz quiz = new Quiz(String.format("%03d", i), problem, explanation, correctAnswer);
            result.addSelectedQuiz(quiz);
        }

        for (Quiz quiz : result.getSelectedQuizList()) {
            runQuiz(quiz);
        }
    }

    private static void runQuiz(Quiz quiz) {
        Cls.clear();
        println(quiz.getProblem());
        String userAnswer = acceptUserAnswer();
        result.addAnswer(userAnswer);
        printBar();
        if (userAnswer.equals(quiz.getCorrectAnswer())) {
            println("\t³‰ðIZ");
        } else {
            println("\t•s³‰ð...~");
        }
        printBar();
        println("‰ðà‚Ö [Enter]");
        scanln();
        printBar();
        println(quiz.getExplanation());
        goNextProblem();
    }

    private static String acceptUserAnswer() {
        System.out.print("\n“š‚¦‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢>>");
        return scanln();
    }

    private static void goNextProblem() {
        System.out.print("\nŽŸ‚Ì–â‘è‚Ö [Enter]");
        scanln();
    }

    private static String scanln() {
        return scanner.nextLine();
    }

    private static void printBar(){
        println("---------------------------------");
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
