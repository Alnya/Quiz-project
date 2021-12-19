import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFiles {
    /**
     * 問題を読み込むためのメソッド。
     *
     * @param index 問題番号
     * @return String 問題文
     */
    public static String readProblem(int index) {
        String pathName = String.format("../problems/%03d.txt", index);
        return read(pathName);
    }

    /**
     * 解説を読み込むためのメソッド。
     *
     * @param index 問題番号
     * @return String 解説文
     */
    public static String readExplanation(int index) {
        String pathName = String.format("../explanations/%03d.txt", index);
        return read(pathName);
    }

    /**
     * 正答を読み込むためのメソッド。
     *
     * @param index 問題番号
     * @return String 正答
     */
    public static String readCorrectAnswer(int index) {
        String pathName = String.format("../correct-answers/%03d.txt", index);
        return read(pathName);
    }

    /**
     * 読み込むファイルの相対パスと、文字コードを指定するためのメソッド。
     *
     * @param pathName 読み込むファイルの相対パス
     * @return String 読み込んだ文字列
     */
    private static String read(String pathName) {
        Path path = Paths.get(pathName);
        Charset charset = Charset.forName("Windows-31J");
        return readAll(path, charset);
    }

    /**
     * 実際にファイルを読み込むためのメソッド。
     *
     * @param path    読み込むファイルの相対パス
     * @param charset 読み込む時の文字コード
     * @return String 読み込んだ文字列
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
