import java.util.Scanner;

public class Main {
    private static final Result result = new Result();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
          Test program of main.
          read problem, correct-answer and explanation 001.txt
         */
        Cls.clear();
        String problem001 = ReadFiles.readProblem(1);
        String correctAnswer001 = ReadFiles.readCorrectAnswer(1);
        String explanation001 = ReadFiles.readExplanation(1);
        Quiz quiz001 = new Quiz(String.format("%03d", 1), problem001, explanation001, correctAnswer001);
        println(quiz001.getProblem());
        result.addSelectedQuiz(quiz001);
        String userAnswer = acceptUserAnswer();
        result.addAnswer(userAnswer);
        println(result.getScore());
        goNextProblem();
    }

    private static String acceptUserAnswer() {
        System.out.print("\n“š‚¦‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢>>");
        return scanln();
    }

    private static void goNextProblem() {
        System.out.print("\nŽŸ‚Ì–â‘è‚Ö [Enter]");
        scanln();
        Cls.clear();
    }

    private static String scanln() {
        return scanner.nextLine();
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
