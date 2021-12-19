import java.io.IOException;

public class Cls {
    /**
     * コマンドラインを綺麗にするためのメソッド。
     * 主に、画面の切り替わりタイミングで活用できる。
     */
    public static void clear() {
        // \033[H -> Move cursor
        // \033[2J -> Clear Screen
        System.out.println("\033[H\033[2J");
        // Flush stdout
        System.out.flush();
    }

    /**
     * コマンドプロンプトにタイトルをつけるためのメソッド。
     * プロジェクトを起動したタイミングでつける。
     */
    public static void setTitle() {
        try {
            new ProcessBuilder("cmd", "/c", "title ---The Programming Quiz Game---  (developed by 19AJ)").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
        }
    }
}
