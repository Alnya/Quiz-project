import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanUtils {
    private static final Scanner scanner = new Scanner(System.in);

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
