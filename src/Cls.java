import java.io.IOException;

public class Cls {
    /**
     * �R�}���h���C�����Y��ɂ��邽�߂̃��\�b�h�B
     * ��ɁA��ʂ̐؂�ւ��^�C�~���O�Ŋ��p�ł���B
     */
    public static void clear() {
        // \033[H -> Move cursor
        // \033[2J -> Clear Screen
        System.out.println("\033[H\033[2J");
        // Flush stdout
        System.out.flush();
    }

    /**
     * �R�}���h�v�����v�g�Ƀ^�C�g�������邽�߂̃��\�b�h�B
     * �v���W�F�N�g���N�������^�C�~���O�ł���B
     */
    public static void setTitle() {
        try {
            new ProcessBuilder("cmd", "/c", "title ---The Programming Quiz Game---  (developed by 19AJ)").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
        }
    }
}
