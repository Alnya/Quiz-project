import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFiles {
    public static String readProblem(int index) {
        String pathName = String.format("../problems/%03d.txt", index);
        return read(pathName);
    }

    public static String readExplanation(int index) {
        String pathName = "../explanations/" + String.format("%03d", index);
        return read(pathName);
    }

    public static String readCorrectAnswer(int index) {
        String pathName = "../correct-answers/" + String.format("%03d", index);
        return read(pathName);
    }

    private static String read(String pathName) {
        Path path = Paths.get(pathName);
        Charset charset = Charset.forName("Windows-31J");
        return readAll(path, charset);
    }

    private static String readAll(Path path, Charset charset) {
        try {
            return new String(Files.readAllBytes(path), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
