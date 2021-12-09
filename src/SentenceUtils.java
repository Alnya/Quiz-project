public class SentenceUtils {
    public static void printAcceptUserAnswer() {
        print("\n��������͂��Ă�������>>");
    }

    public static void printToExplanation() {
        println("����� [Enter]");
    }

    public static void printCorrect() {
        println("\t�����I�Z");
    }

    public static void printIncorrect() {
        println("\t�s����...�~");
    }

    public static void printToNext() {
        print("\n���֐i�� [Enter]");
    }

    public static void printToSpecial() {
        System.out.println("��������8���������̂ŁA���p��肪�o�������I\n");
    }

    public static void printFinalResult() {
        System.out.println("---��������---\n");
    }

    public static void printResultProblem(String number, String answer, String correctAnswer) {
        System.out.println("���ԍ�" + number);
        System.out.println("���Ȃ��̓����F" + answer + "  �����F" + correctAnswer + "\n");
    }

    public static void printFinalScore(int score, int maxScore) {
        System.out.println("�ŏI�X�R�A�F" + score + " / " + maxScore);
    }


    public static void printBar() {
        println("---------------------------------");
    }

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

    private static void print(Object obj) {
        System.out.print(obj);
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}
