import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFiles {
    private static String readAll(Path path, Charset charset) {
        try {
            return new String(Files.readAllBytes(path), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
