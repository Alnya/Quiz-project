public class SentenceUtils {
    /**
     * ユーザーの解答入力サポート。
     */
    public static void printAcceptUserAnswer() {
        print("\n答えを入力してください>>");
    }

    /**
     * ユーザーのエンターキー入力サポート。
     */
    public static void printToExplanation() {
        println("解説へ [Enter]");
    }

    /**
     * 正解！
     */
    public static void printCorrect() {
        println("\t正解！〇");
    }

    /**
     * 不正解。。
     */
    public static void printIncorrect() {
        println("\t不正解...×");
    }

    /**
     * ユーザーのエンターキー入力サポート。
     */
    public static void printToNext() {
        print("\n次へ進む [Enter]");
    }

    /**
     * 応用問題出現。
     */
    public static void printToSpecial() {
        System.out.println("正答率が8割超えたので、応用問題が出現した！\n");
    }

    /**
     * 総合結果。
     */
    public static void printFinalResult() {
        System.out.println("---総合結果---\n");
    }

    /**
     * ユーザーが答えた問題ごとに問題番号、ユーザーの解答、正答を出力するためのメソッド。
     *
     * @param number        問題番号
     * @param answer        ユーザーの解答
     * @param correctAnswer 正答
     */
    public static void printResultProblem(String number, String answer, String correctAnswer) {
        System.out.println("問題番号" + number);
        System.out.println("あなたの答え：" + answer + "  正解：" + correctAnswer + "\n");
    }

    /**
     * 最終スコアを出力するためのメソッド。
     *
     * @param score    最終スコア
     * @param maxScore 答えた問題数
     */
    public static void printFinalScore(int score, int maxScore) {
        System.out.println("最終スコア：" + score + " / " + maxScore);
    }

    /**
     * Bar。
     */
    public static void printBar() {
        println("---------------------------------");
    }

    /**
     * タイトルを出力します。
     */
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

    /**
     * プログレスバーを出力します。
     *
     * @param n 問題の進捗具合
     */
    public static void printProgress(int n) {
        print("\n Now Progress:[");
        for (int i = 0; i < n; i++) {
            print("==");
        }
        print(">");
        for (int i = 0; i < 9 - n; i++) {
            print("  ");
        }
        println("]\n\n");
    }

    /**
     * 出力をするメソッド文が長いので、省略するために生まれてきたメソッド。
     *
     * @param obj Object
     */
    private static void print(Object obj) {
        System.out.print(obj);
    }

    /**
     * 出力をするメソッド文が長いので、省略するために生まれてきたメソッド。
     *
     * @param obj Object
     */
    private static void println(Object obj) {
        System.out.println(obj);
    }
}
