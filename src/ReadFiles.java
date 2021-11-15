import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFiles {
    public static String readProblem(int index) {
        String pathName = "../problems/" + String.format("%03d", index);
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
