import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanUtils {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * 解答入力や、画面遷移のための入力待ちをするためのメソッド。
     * Ctrl＋Cで強制終了させるため、終了の旨を出力する。
     *
     * @return String
     */
    public static String scanln() {
        try {
            return scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println();
            System.out.println("終了コードが押されました。システムを強制終了します。");
            System.exit(0);
            return null;
        }
    }
}
