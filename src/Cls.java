import java.io.IOException;

public class Cls {
    public static void clear() {
        // \033[H -> Move cursor
        // \033[2J -> Clear Screen
        System.out.println("\033[H\033[2J");
        // Flush stdout
        System.out.flush();
    }

    public static void setTitle() {
        try {
            new ProcessBuilder("cmd", "/c", "title ---The Programming Quiz Game---  (developed by 19AJ)").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
