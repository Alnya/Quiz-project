public class SentenceUtils {
    public static void printAcceptUserAnswer() {
        print("\n答えを入力してください>>");
    }

    public static void printToExplanation() {
        println("解説へ [Enter]");
    }

    public static void printCorrect() {
        println("\t正解！〇");
    }

    public static void printIncorrect() {
        println("\t不正解...×");
    }

    public static void printToNext() {
        print("\n次へ進む [Enter]");
    }

    public static void printToSpecial() {
        System.out.println("正答率が8割超えたので、応用問題が出現した！\n");
    }

    public static void printFinalResult() {
        System.out.println("---総合結果---\n");
    }

    public static void printResultProblem(String number, String answer, String correctAnswer) {
        System.out.println("問題番号" + number);
        System.out.println("あなたの答え：" + answer + "  正解：" + correctAnswer + "\n");
    }

    public static void printFinalScore(int score, int maxScore) {
        System.out.println("最終スコア：" + score + " / " + maxScore);
    }


    public static void printBar() {
        println("---------------------------------");
    }

    public static void printTitle() {
        for (int i = 0; i < 5; i++) {
            println("");
        }
        println("                       +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                   ---The Programming Quiz Game---                   +");
        println("                       +                                                                     +");
        println("                       +                        (developed by 19AJ)                          +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +                                                                     +");
        println("                       +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 5; i++) {
            println("");
        }
        println("                                     ----------PRESS ENTER TO START----------");
        print("                                                          ");
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
