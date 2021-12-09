import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String scanln() {
        try {
            return scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println();
            System.out.println("�I���R�[�h��������܂����B�V�X�e���������I�����܂��B");
            System.exit(0);
            return null;
        }
    }
}
