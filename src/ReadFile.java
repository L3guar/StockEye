import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Leguar on 3/02/2015.
 */
public class ReadFile {
    private String path;

    public ReadFile(String file_path) {
        path = file_path;
    }

    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        return null;
    }
}
