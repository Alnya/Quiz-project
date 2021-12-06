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

    public static void printBar() {
        println("---------------------------------");
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
