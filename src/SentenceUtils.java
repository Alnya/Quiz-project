public class SentenceUtils {
    /**
     * ���[�U�[�̉𓚓��̓T�|�[�g�B
     */
    public static void printAcceptUserAnswer() {
        print("\n��������͂��Ă�������>>");
    }

    /**
     * ���[�U�[�̃G���^�[�L�[���̓T�|�[�g�B
     */
    public static void printToExplanation() {
        println("����� [Enter]");
    }

    /**
     * �����I
     */
    public static void printCorrect() {
        println("\t�����I�Z");
    }

    /**
     * �s�����B�B
     */
    public static void printIncorrect() {
        println("\t�s����...�~");
    }

    /**
     * ���[�U�[�̃G���^�[�L�[���̓T�|�[�g�B
     */
    public static void printToNext() {
        print("\n���֐i�� [Enter]");
    }

    /**
     * ���p���o���B
     */
    public static void printToSpecial() {
        System.out.println("��������8���������̂ŁA���p��肪�o�������I\n");
    }

    /**
     * �������ʁB
     */
    public static void printFinalResult() {
        System.out.println("---��������---\n");
    }

    /**
     * ���[�U�[����������育�Ƃɖ��ԍ��A���[�U�[�̉𓚁A�������o�͂��邽�߂̃��\�b�h�B
     *
     * @param number        ���ԍ�
     * @param answer        ���[�U�[�̉�
     * @param correctAnswer ����
     */
    public static void printResultProblem(String number, String answer, String correctAnswer) {
        System.out.println("���ԍ�" + number);
        System.out.println("���Ȃ��̓����F" + answer + "  �����F" + correctAnswer + "\n");
    }

    /**
     * �ŏI�X�R�A���o�͂��邽�߂̃��\�b�h�B
     *
     * @param score    �ŏI�X�R�A
     * @param maxScore ��������萔
     */
    public static void printFinalScore(int score, int maxScore) {
        System.out.println("�ŏI�X�R�A�F" + score + " / " + maxScore);
    }

    /**
     * Bar�B
     */
    public static void printBar() {
        println("---------------------------------");
    }

    /**
     * �^�C�g�����o�͂��܂��B
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
     * �v���O���X�o�[���o�͂��܂��B
     *
     * @param n ���̐i���
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
     * �o�͂����郁�\�b�h���������̂ŁA�ȗ����邽�߂ɐ��܂�Ă������\�b�h�B
     *
     * @param obj Object
     */
    private static void print(Object obj) {
        System.out.print(obj);
    }

    /**
     * �o�͂����郁�\�b�h���������̂ŁA�ȗ����邽�߂ɐ��܂�Ă������\�b�h�B
     *
     * @param obj Object
     */
    private static void println(Object obj) {
        System.out.println(obj);
    }
}
