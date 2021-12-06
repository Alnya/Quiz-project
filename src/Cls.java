import java.io.IOException;

public class Cls {
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setTitle() {
        try {
            new ProcessBuilder("cmd", "/c", "title ---The Programming Quiz Game---  (developed by 19AJ)").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
