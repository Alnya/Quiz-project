import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFiles {
    /**
     * ����ǂݍ��ނ��߂̃��\�b�h�B
     *
     * @param index ���ԍ�
     * @return String ��蕶
     */
    public static String readProblem(int index) {
        String pathName = String.format("../problems/%03d.txt", index);
        return read(pathName);
    }

    /**
     * �����ǂݍ��ނ��߂̃��\�b�h�B
     *
     * @param index ���ԍ�
     * @return String �����
     */
    public static String readExplanation(int index) {
        String pathName = String.format("../explanations/%03d.txt", index);
        return read(pathName);
    }

    /**
     * ������ǂݍ��ނ��߂̃��\�b�h�B
     *
     * @param index ���ԍ�
     * @return String ����
     */
    public static String readCorrectAnswer(int index) {
        String pathName = String.format("../correct-answers/%03d.txt", index);
        return read(pathName);
    }

    /**
     * �ǂݍ��ރt�@�C���̑��΃p�X�ƁA�����R�[�h���w�肷�邽�߂̃��\�b�h�B
     *
     * @param pathName �ǂݍ��ރt�@�C���̑��΃p�X
     * @return String �ǂݍ��񂾕�����
     */
    private static String read(String pathName) {
        Path path = Paths.get(pathName);
        Charset charset = Charset.forName("Windows-31J");
        return readAll(path, charset);
    }

    /**
     * ���ۂɃt�@�C����ǂݍ��ނ��߂̃��\�b�h�B
     *
     * @param path    �ǂݍ��ރt�@�C���̑��΃p�X
     * @param charset �ǂݍ��ގ��̕����R�[�h
     * @return String �ǂݍ��񂾕�����
     */
    private static String readAll(Path path, Charset charset) {
        try {
            return new String(Files.readAllBytes(path), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
